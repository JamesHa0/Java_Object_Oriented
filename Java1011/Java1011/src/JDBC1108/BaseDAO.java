package JDBC1108;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BaseDAO {
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;

    public int getCount(String sql,Object... args) throws SQLException {
        conn = DBUtil.getConnection();
        pst = conn.prepareStatement(sql);
        for(int i = 0 ;i <args.length ; i++){
            pst.setObject(i+1,args[i]);
        }
        rs = pst.executeQuery();
        if(rs.next()){
            rs.last();
            return rs.getRow();
        }
        return 0;
    }
    public int executeUpdate(String sql,Object... args) throws SQLException {
        conn = DBUtil.getConnection();
        pst = conn.prepareStatement(sql);
        for(int i = 0 ;i <args.length ; i++){
            pst.setObject(i+1,args[i]);
        }
        ;
        return pst.executeUpdate();
    }

    public <T> List<T> executeQuery(String sql,Class<T> clazz,Object... args) throws Exception {
        conn = DBUtil.getConnection();
        List<T> list = new ArrayList<T>();
        pst = conn.prepareStatement(sql);
        for(int i = 0 ;i <args.length ; i++){
            pst.setObject(i+1,args[i]);
        }
        rs = pst.executeQuery();
        Field[] fs = clazz.getDeclaredFields();
        String[] colNames = new String[fs.length];
        String[] rTypes = new String[fs.length];
        Method[] methods = clazz.getMethods();

        while(rs.next()){
            for (int i = 0; i < fs.length; i++){
                Field f = fs[i];
                String colName = f.getName().substring(0,1).toUpperCase()+f.getName().substring(1);
                colNames[i] = colName;
                String rType = f.getType().getSimpleName();
                rTypes[i] = rType;
            }
            T object = (T)clazz.newInstance();
            for(int i = 0; i < colNames.length; i++){
                String colName = colNames[i];
                String methodName = "set" + colName;
                for (Method m : methods){
                    if (methodName.equals((m.getName()))){
                        //m.invoke(object,rs.getInt("deptno"));
                        if ("int".equals(rTypes[i]) || "Integer".equals(rTypes[i])){
                            m.invoke(object,rs.getInt(colName));
                        } else if ("Date".equals(rTypes[i])) {
                            m.invoke(object,rs.getDate(colName));
                        } else if ("Timestamp".equals(rTypes[i])) {
                            m.invoke(object,rs.getTimestamp(colName));
                        } else {
                            m.invoke(object,rs.getObject(colName));
                        }
                        break;
                    }
                }
            }
            list.add(object);
        }
        return list;
    }
}
