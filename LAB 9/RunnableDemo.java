class MyRunnable implements Runnable {
    MyRunnable() {
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        new MyRunnable();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}