import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String [] args){
        int arr1 [] = {1,2,4,9,12,15};
        int arr2 [] = {3,5,7,10,6,8,14};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int merged [] = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 ) {
            merged [k++] = arr1[i++];
        }
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        System.out.println("Merged Sorted Array: "+Arrays.toString(merged));

    }
}
