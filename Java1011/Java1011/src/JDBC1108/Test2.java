package JDBC1108;

import java.util.List;

public class Test2 {
    public static void main(String[] args) throws Exception {
        BaseDAO dao = new BaseDAO();
//        List<Emp> list = dao.executeQuery("select * from emp where sal > ? and job = ?",Emp.class,2000,"MANAGER");
//        for(Emp e:list){
//            System.out.println(e);
//        }
        int count = dao.getCount("select * from emp where sal > ?",2000);
        System.out.println(count);
    }
}
