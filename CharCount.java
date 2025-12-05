
import java.util.*;
public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String str = sc.nextLine();

        int letters = 0, digits = 0, special = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) letters++;
            else if (Character.isDigit(ch)) digits++;
            else special++;
        }

        System.out.println("No. of Letters: " + letters);
        System.out.println("No.of Digits: " + digits);
        System.out.println("No.of Special characters: " + special);
    }
}
