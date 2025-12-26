import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,2,2,28,8,9,10,7,6,8,9,5,4,6,7,8);

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : numbers) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequencies: " + freqMap);
    }
}
