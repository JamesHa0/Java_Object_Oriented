package java1101;

public class PrimeThread {
    public static void main(String[] args) {
        PrimeF thread1 = new PrimeF(1, 1000);
        PrimeF thread2 = new PrimeF(1001, 2000);
        PrimeF thread3 = new PrimeF(2001, 3000);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class PrimeF extends Thread {
    private int start;
    private int end;
    public PrimeF(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        String myName = this.getName();
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(myName + " found " + i + " is PrimeNumber");
            }
        }
    }
    protected static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else if (num <= 3) {
            return true;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }


    }
}
