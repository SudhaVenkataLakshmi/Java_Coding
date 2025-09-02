import java.util.Scanner;

public class ArrayAscending {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+ "Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array in Ascending Order: ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}
