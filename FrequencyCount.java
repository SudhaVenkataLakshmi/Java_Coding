import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,3,2,2,2,2,1,1,3,3,5,5,5,5,6,6,6,8,8,9,6,5,4,6,6,8,8,8,9,8);

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : numbers) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequencies: " + freqMap);
    }
}
