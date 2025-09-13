import java.util.Scanner;

public class SumAndAverage {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+n+ " Numbers: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
       int sum = 0;
       for(int num : arr){
        sum += num;
       }
       double average = (double) sum / n;
       System.out.println("Sum of Elements = " + sum);
       System.out.println("Average of Elements = " + average);
       sc.close();
    }
}
