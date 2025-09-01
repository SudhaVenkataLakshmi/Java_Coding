import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any value: ");
        String input = scanner.nextLine();
        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i--){
            reversed += input.charAt(i);
        }
        if(input.equals(reversed)){
            System.out.println("It is Palindrome.");
        }else{
            System.out.println("It is not a Palindrome.");
        }
        scanner.close();
    }
}









