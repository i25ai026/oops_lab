class SinThread extends Thread {
    double x;

    SinThread(double x) {
        this.x = x;
    }

    public void run() {
        double sinSeries = 0;
        int sign = 1;

        for (int i = 1; i <= 10; i += 2) {
            double term = Math.pow(x, i) / factorial(i);
            sinSeries += sign * term;
            sign *= -1;
        }

        System.out.println("Sin(x) using series: " + sinSeries);
        System.out.println("Sin(x) using Math: " + Math.sin(x));
    }

    long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }
}

class CosThread extends Thread {
    double x;

    CosThread(double x) {
        this.x = x;
    }

    public void run() {
        double cosSeries = 0;
        int sign = 1;

        for (int i = 0; i <= 10; i += 2) {
            double term = Math.pow(x, i) / factorial(i);
            cosSeries += sign * term;
            sign *= -1;
        }

        System.out.println("Cos(x) using series: " + cosSeries);
        System.out.println("Cos(x) using Math: " + Math.cos(x));
    }

    long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }
}

public class SinCosThreadDemo {
    public static void main(String[] args) {
        double x = Math.PI / 4;

        SinThread t1 = new SinThread(x);
        CosThread t2 = new CosThread(x);

        t1.start();
        t2.start();
    }
}