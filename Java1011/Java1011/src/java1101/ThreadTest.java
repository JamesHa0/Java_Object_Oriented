package java1101;

public class ThreadTest extends Thread{
    Account account;
    public ThreadTest(Account account){
        this.account = account;
    }

    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name + "要取钱");
        account.take(name);
    }
}
