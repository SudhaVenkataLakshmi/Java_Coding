import java.util.Arrays;
import java.util.Collections;

public class SortArray{
    public static void main(String [] args){
        Integer arr[] = {2,1,3,12,8,7,10,9};
        System.out.println("Original Array: " +Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Ascending Order: " + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending Order: " + Arrays.toString(arr));
    }
}

