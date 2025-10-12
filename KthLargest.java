import java.util.*;

public class KthLargest {
    public static void main(String[] args) {
        int[] nums = {20,50,32,60,42,8,56};
        int k = 2;
        System.out.println("Kth Largest: " + findKthLargest(nums, k));
    }

    static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
