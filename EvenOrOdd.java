import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Value: ");
        double val = scanner.nextDouble();
        if(val%2 == 0){
            System.out.println("Your value is Even.");
        }else{
            System.out.println("Your value is Odd.");;
        }
    }
}
