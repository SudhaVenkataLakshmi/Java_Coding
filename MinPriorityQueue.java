import java.util.PriorityQueue;

public class MinPriorityQueue {
    public static void main(String [] args){
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(1);
        minPQ.add(9);
        minPQ.add(6);
        minPQ.add(5);
        minPQ.forEach((Integer val) -> System.out.println(val));
        while(!minPQ.isEmpty()){
            int val = minPQ.poll();
            System.out.println("Remove from top: "+val);
        }
    }
}
