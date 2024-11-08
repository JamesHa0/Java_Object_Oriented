package JDBC1108;

import java.sql.*;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement st = null;
        ResultSet rs =null;
        PreparedStatement pst = null;
        try {
            //1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.连接数据库
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Shanghai","root","root");

            //3.创建Statement对象
//            st = conn.createStatement();
            pst = conn.prepareStatement("select * from emp where empno= ?");
            pst.setInt(1,7900);

            //4.执行查询或更新
//            rs = st.executeQuery("select * from emp");
            rs = pst.executeQuery();

            //5.操作结果集
            while(rs.next()){
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                Date hiredate = rs.getDate("hiredate");
                int sal = rs.getInt("sal");
                int deptno = rs.getInt("deptno");
                System.out.println(empno+","+ename+","+job+","+hiredate+","+sal+","+deptno);
            }



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
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
}
