package java1101;

public class Account {
    private int balance = 1001;

    public void take(String name) {
        System.out.println(name + "准备取钱");
        synchronized (this) {
            if (this.balance >= 1000) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                balance -= 1000;
                System.out.println(name + "取了1000元,余额：" + this.balance);
            }else {
                System.out.println(name + "余额不足，无法取钱");
            }
        }

    }
}
