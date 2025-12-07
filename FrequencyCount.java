import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,4,5,4,5,6,4,3,3,2,1,3,4,4,4);

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : numbers) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequencies: " + freqMap);
    }
}
