
import java.util.ArrayList;
import java.util.Collections; 
import java.util.List;

public class TestCollections {  
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(3);
        values.add(2);
        values.add(4);
        System.out.println("Max Value: " + Collections.max(values));
        System.out.println("Min Value: " + Collections.min(values));
        Collections.sort(values);
        System.out.println("Sorted:");
        values.forEach((Integer val) -> System.out.println(val));
    }
}

