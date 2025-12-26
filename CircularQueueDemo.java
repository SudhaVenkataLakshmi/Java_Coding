class CircularQueue {
    int[] arr;
    int front, rear, size, capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    void enqueue(int val) {
        if (size == capacity) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = val;
        size++;
    }
    int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty!");
        }
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }
    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(90);
        cq.enqueue(55);
        cq.enqueue(65);
        cq.display(); 
        cq.dequeue();
        cq.display();  
    }
}

