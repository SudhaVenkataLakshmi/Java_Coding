import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Value: ");
        int first = scanner.nextInt();
        System.out.print("Enter Second Value: ");
        int second = scanner.nextInt();
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci Serires is: ");
        System.out.print(first+ " " +second);
        for(int i=3;i <= n;i++){
            int next = first + second;
            System.out.print(" " +next);
            first = second;
            second = next;
        }
        scanner.close();
    }
}
