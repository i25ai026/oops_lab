package LAB5;

interface QueueImpl {
    void insert(int x) throws Exception;
    int delete() throws Exception;
    void display();
}

class QueueDemo implements QueueImpl {

    int queue[] = new int[10];  
    int front = -1, rear = -1;

    public void insert(int x) throws Exception {
        if (rear == 9) {
            throw new Exception("Queue Overflow");
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        queue[rear] = x;
        System.out.println(x + " inserted into queue");
    }

    public int delete() throws Exception {
        if (front == -1 || front > rear) {
            throw new Exception("Queue Underflow");
        }

        int val = queue[front];
        front++;

        System.out.println(val + " deleted from queue");
        return val;
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class QueueTest {
    public static void main(String[] args) {

        QueueDemo q = new QueueDemo();

        try {
            q.insert(10);
            q.insert(20);
            q.insert(30);

            q.display();

            q.delete();

            q.display();

            for (int i = 0; i < 10; i++) {
                q.insert(i * 5);
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            for (int i = 0; i < 15; i++) {
                q.delete();
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}