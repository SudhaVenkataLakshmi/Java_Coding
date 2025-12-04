import java.util.PriorityQueue;

public class MinPriorityQueue {
    public static void main(String [] args){
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(1);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(3);
        minPQ.forEach((Integer val) -> System.out.println(val));
        while(!minPQ.isEmpty()){
            int val = minPQ.poll();
            System.out.println("Remove from top: "+val);
        }
    }
}
