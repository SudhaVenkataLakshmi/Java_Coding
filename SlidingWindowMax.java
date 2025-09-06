import java.util.*;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(maxSlidingWindow(arr, k));
    }
    static List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.add(i);

            if (i >= k - 1) {
                result.add(nums[dq.peek()]);
            }
        }
        return result;
    }
}
