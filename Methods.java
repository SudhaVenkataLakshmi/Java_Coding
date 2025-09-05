import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static void main(String [] args){
        List<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(3);
        values.add(4);
        System.out.println("Size: "+values.size());
        System.out.println("Size: "+values.isEmpty());
        System.out.println("Size: "+values.contains(5));
        values.add(5);
        System.out.println("Size: "+values.contains(5));
        values.remove(3);
        System.out.println("Removed using index: "+values.contains(5));
        values.remove(Integer.valueOf(3));
        System.out.println("Removed using object: "+values.contains(3));

    }
}
