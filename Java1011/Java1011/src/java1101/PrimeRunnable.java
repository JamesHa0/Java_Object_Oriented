package java1101;

public class PrimeRunnable {
    public static void main(String[] args) {
        PrimeFound pf1 = new PrimeFound(1, 1000);
        PrimeFound pf2 = new PrimeFound(1001, 2000);
        PrimeFound pf3 = new PrimeFound(2001, 3000);

        Thread thread1 = new Thread(pf1);
        Thread thread2 = new Thread(pf2);
        Thread thread3 = new Thread(pf3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class PrimeFound implements Runnable{
    private int start;
    private int end;

    public PrimeFound(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        String myName = Thread.currentThread().getName();
        for (int i = start; i <= end; i++) {
            if (PrimeF.isPrime(i)) {
                System.out.println(myName + " found " + i + " is PrimeNumber");
            }
        }
    }
}
