
import java.util.*;
public class ArrayRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Reversed Array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
