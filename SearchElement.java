import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                position = i;
                break;
            }
        }
        if (found) {
            System.out.println(key + " found at index " + position);
        } else {
            System.out.println(key + " not found in the array.");
        }
        sc.close();
    }
}

