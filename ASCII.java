import java.util.Scanner;

public class ASCII {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        int ASCII = (int) ch;
        System.out.println("The ASCII Value of '" + ch + "' is: " + ASCII);
        scanner.close();
    }
}
