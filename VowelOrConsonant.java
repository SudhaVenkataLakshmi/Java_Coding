import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Character: ");
        char ch = scanner.next().toLowerCase().charAt(0);
        if(ch>='a'&&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch+ "is Vowel.");
            }else{
                System.out.println(ch+ "is consonant");
            }
        }else{
            System.out.println("Invalid Character. Please enter an alphabet character.");
        }
    }
}
