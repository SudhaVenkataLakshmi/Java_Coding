import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 3, 2, 5, 4, 3);

        Set<Integer> unique = new LinkedHashSet<>(numbers);

        System.out.println("After removing duplicates: " + unique);
    }
}
