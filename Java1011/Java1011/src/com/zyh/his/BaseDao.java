package com.zyh.his;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseDao {
    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;


    public <T> List<T> executeQuery(String sql,Class<T> clazz,Object... args ){
        List<T> list = new ArrayList<>();

        conn = DbHelper.getConnection();
        try {
            pst = conn.prepareStatement(sql);
            //给pst设置参数
            for (int i=0;i<args.length;i++){
                pst.setObject(i+1,args[i]);
            }
            //执行查询
            rs = pst.executeQuery();
            //获取结果(反射知识)
            Field[] fs = clazz.getDeclaredFields();
            String[] colNames = new String[fs.length];
            String[] rTypes = new String[fs.length];
            Method[] methods = clazz.getMethods();
            while(rs.next()){
                for (int i = 0; i < fs.length; i++) {
                    Field f = fs[i];
                    String colName = f.getName().substring(0,1).toUpperCase()+f.getName().substring(1);
                    colNames[i] = colName;
                    String rType =  f.getType().getSimpleName();
                    rTypes[i] = rType;
                }
                Object o = (T) clazz.newInstance();
                for (int i = 0; i < colNames.length; i++) {
                  String colName = colNames[i];
                  String methodName = "set"+colName;
                  for(Method m : methods){
                      if(methodName.equals(m.getName())){
                          if("int".equals(rTypes[i]))
                            m.invoke(o,rs.getInt(colName));
                          else if("Date".equals(rTypes[i])){
                              m.invoke(o,rs.getDate(colName));
                          }else if("Timestamp".equals(rTypes[i]))
                              m.invoke(o,rs.getTimestamp(colName));
                          else{
                              m.invoke(o,rs.getObject(colName));
                          }
                          break;
                      }
                  }

                }
                list.add((T) o);

            }
            return list;
        } catch (SQLException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        } finally {
            DbHelper.closeConn(conn,pst,rs);
        }

    }

    public int executeUpdate(String sql,Object... args){
        conn = DbHelper.getConnection();
        try {
            pst = conn.prepareStatement(sql);
            //给pst设置参数
            for (int i=0;i<args.length;i++){
                pst.setObject(i+1,args[i]);
            }
            int ret = pst.executeUpdate();
            return ret;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DbHelper.closeConn(conn,pst,rs);
        }
    }
}
