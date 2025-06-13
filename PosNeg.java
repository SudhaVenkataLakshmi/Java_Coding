import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        double num = scanner.nextDouble();
        if(num>0)
        System.out.print("Your Value is positive.");
        else if(num<0)
        System.out.print("Your Value is Negative.");
        else
        System.out.print("Your Value is Neutral(Zero).");
    }    
}
