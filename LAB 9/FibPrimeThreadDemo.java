class FibonacciThread extends Thread {
    public void run() {
        try {
            int a = 1, b = 1, c;

            System.out.println("Fibonacci Series:");
            System.out.print(a + " " + b + " ");

            for (int i = 3; i <= 50; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;

                if (i == 25) {
                    System.out.println("\nFibonacci thread sleeping...");
                    Thread.sleep(2000);
                }
            }
        } catch (Exception e) {}
    }
}

class PrimeThread extends Thread {
    public void run() {
        int count = 0, num = 2;

        System.out.println("\nPrime Numbers:");

        while (count < 25) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}

public class FibPrimeThreadDemo {
    public static void main(String[] args) {
        FibonacciThread t1 = new FibonacciThread();
        PrimeThread t2 = new PrimeThread();

        t1.setPriority(8);
        t2.setPriority(5);

        t1.start();
        t2.start();
    }
}