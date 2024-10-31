package java1031;

public class ThreadTest2 {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest("线程01");
        t1.setPriority(1);
        t1.start();

        ThreadTest t2 = new ThreadTest("线程02");
        t2.setPriority(10);
        t2.start();

        System.out.println(t1.isAlive());
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(t1.isAlive());
    }
}
