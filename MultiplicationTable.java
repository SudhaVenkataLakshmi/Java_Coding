import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any value: ");
        int value = scanner.nextInt();

        System.out.println("Multiplication Table for " + value + ":");
        for(int i = 1; i <= 10; i++){
            System.out.println(value + " X " + i + " = " + (value * i));
        }

        scanner.close();
    }
}
