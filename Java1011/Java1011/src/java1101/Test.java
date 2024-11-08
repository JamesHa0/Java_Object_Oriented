package java1101;

public class Test {
    public static void main(String[] args) {
        Account a = new Account();
        ThreadTest tt1 = new ThreadTest(a);
        ThreadTest tt2 = new ThreadTest(a);

        tt1.start();
        tt2.start();
    }
}
