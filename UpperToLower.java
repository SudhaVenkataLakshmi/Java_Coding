import java.util.Scanner;

public class UpperToLower {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any sentence with uppercase format: ");
        String input = scanner.nextLine();
        String lowercase = input.toLowerCase();
        System.out.println("Lowercase version: " + lowercase);
        scanner.close();
        
    }
}
