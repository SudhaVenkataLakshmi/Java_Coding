import java.util.Arrays;

public class Arrays8 {
    public static void main(String[] args) {
        int [] arr1 = {6,8,3,2,5,9};
        int [] arr2 = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
        // System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
