package java1031;

public class ThreadTest extends Thread {
    String name;
    public ThreadTest(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("线程ID:"+this.getId()+" 线程名称:"+this.getName()+" 优先级:"+this.getPriority()+" -> 线程已启动");
        for (int i = 0 ; i < 10;i++){
            System.out.println(this.getName()+"运行第"+i+"次");
        }
    }

    public static void main(String[] args) {
        System.out.println("线程ID："+Thread.currentThread().getId() + " 线程名称："+Thread.currentThread().getName()+" -> 线程已启动");

        new ThreadTest("MyThread 001").start();

        for (int i = 0 ; i < 10;i++){
            System.out.println(Thread.currentThread().getName()+"运行第"+i+"次");
        }

    }
}

//public class ThreadTest implements Runnable{
//    String name;
//    public ThreadTest(String name) {
//        super();
//    }
//    @Override
//    public void run() {
//        System.out.println("线程ID："+Thread.currentThread().getId()+" 线程名称："+Thread.currentThread().getName()+" -> 线程已启动");
//        for (int i = 0 ; i < 10;i++){
//            System.out.println(Thread.currentThread().getId()+"运行第"+i+"次");
//        }
//    }
//
//    public static void main(String[] args) {
//        ThreadTest mt2 = new ThreadTest("MyThread 002");
//        Thread th2 = new Thread(mt2);
//        th2.start();
//        System.out.println("线程ID："+th2.getId() + " 线程名称："+th2.getName()+" -> 线程已启动");
//        for (int i = 0 ; i < 10;i++){
//            System.out.println(th2.getName()+"运行第"+i+"次");
//        }
//
//    }
//}