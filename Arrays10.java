import java.util.Arrays;

public class Arrays10 {
    public static void main(String[] args) {
        int arr1[] = {2,4,6,7,9,10};
        int arr2[] = {15,3,8,5,1,17};
        int[] mergedArr = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){
            mergedArr[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            mergedArr[arr1.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(mergedArr));
    }
}
