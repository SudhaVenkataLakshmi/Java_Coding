import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchEx {
    public static int binarySearch(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {10,11,5,7,9,3,6,2};
        Arrays.sort(arr); 

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.print("Enter the Element to Search: ");
        int key = sc.nextInt();
        
        int result = binarySearch(arr, key);
        
        if (result == -1) {
            System.out.println("Element not found in array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
        
        sc.close();
    }
}
