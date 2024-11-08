package JDBC1108;

import java.sql.*;

public class DBUtil {

    static {
        try {
            //1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        //2.连接数据库
        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Shanghai";
        Connection conn = DriverManager.getConnection(url,"root","root");
        return conn;
    }

    public static void close(Statement st, Connection conn, ResultSet rs) throws SQLException {
        //6.释放资源
        if(rs != null){
            rs.close();
        }
        if(st != null){
            st.close();
        }
        if(conn != null){
            conn.close();
        }
    }
}
