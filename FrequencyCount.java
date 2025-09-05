import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 3, 5, 1, 2);

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : numbers) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequencies: " + freqMap);
    }
}
