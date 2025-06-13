import java.util.Scanner;

public class SumOfNaturals {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for(int i=1; i<=number;i++){
            sum = sum+i;
        }
        System.out.println("Sum of first " +number+ " natural numbers is: " +sum);
        scanner.close();
    }
}
