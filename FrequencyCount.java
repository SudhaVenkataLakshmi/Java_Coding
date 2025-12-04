import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,5,5,5,6,7,4,3,4,5,3);

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : numbers) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequencies: " + freqMap);
    }
}
