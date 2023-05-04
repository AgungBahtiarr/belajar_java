package queue;

public class Queue {
    int[] element;
    int front;
    int rear;
    int maxQueue;

    public Queue(int max) {
        front = 0;
        rear = -1;
        element = new int[max];
        maxQueue = max - 1;
    }

    public boolean isEmpty() {
        boolean flag;
        if (rear < 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public boolean isFull() {
        boolean flag;
        if (rear == maxQueue) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow, tidak dapat mengisi data lagi");
        } else {
            rear += 1;
            element[rear] = data;
        }
    }

    public int dequeue() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Queue Underflow");
        } else {
            data = element[front];
            element[front] = 0;
            front += 1;
        }
        return data;
    }

    public void printQueue() {
        if (!isEmpty()) {
            System.out.println("Menampilkan urutan dari posisi tertinggi");
            for (int i = front; i > -1; i--) {
                System.out.println("Elemen ke-" + i + "=" + element[i]);
            }
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public static void main(String[] args) {
        Queue s = new Queue(100);
        s.enqueue(10);
        s.enqueue(20);
        s.enqueue(30);

        s.dequeue();
        s.printQueue();
    }
}
