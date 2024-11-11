package com.zyh.his;

import java.sql.*;

public class DbHelper {

    public static Connection getConnection(){
        Connection conn = null;

        try {

            //1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.获取数据库连接
            //jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Shanghai
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/his?serverTimezone=GMT%2B8",
                    "root", "root");
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;

    }

    public static void closeConn(Connection conn,PreparedStatement pst,ResultSet rs){
        //6.释放资源
        try {
            if(rs!=null)
                rs.close();
            if(pst!=null)
                pst.close();
            if(conn!=null)
                conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
