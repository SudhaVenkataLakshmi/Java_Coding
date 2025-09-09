import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(50);
        q.add(70);
        q.add(40);
        System.out.println("Queue: " + q);
        System.out.println("Removed: " + q.poll()); 
        System.out.println("Queue after removal: " + q);
        System.out.println("Front element: " + q.peek());
    }
}

