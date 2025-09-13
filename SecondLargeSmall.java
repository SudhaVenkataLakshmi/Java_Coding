import java.util.Arrays;

public class SecondLargeSmall {
    public static void main(String [] args){
        int arr[] = {10, 20,3,12,34,69,72,9};
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        int n = arr.length;
        int secondSmallest = -1;
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[0]){
                secondSmallest = arr[i];
                break;
            }
        }
        int secondLargest = -1;
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] != arr[n - 1]){
                secondLargest = arr[i];
                break;
            }
        }
        if(secondSmallest == -1){
            System.out.println("No second smallest element (all elements are same).");
        } else {
            System.out.println("Second Smallest: " + secondSmallest);
        }

        if(secondLargest == -1){
            System.out.println("No second largest element (all elements are same).");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }
    }
}
