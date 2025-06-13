import java.util.Scanner;

public class LargeOfThree {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        Double a = scanner.nextDouble();
        System.out.print("Enter b value: ");
        Double b = scanner.nextDouble();
        System.out.print("Enter c value: ");
        Double c = scanner.nextDouble();
        if(a>b && a>c){
            System.out.println("Largest value is: " +a);
        }else if(b>c){
            System.out.println("Largest value is: " +b);
        }else{
            System.out.println("Largest value is: " +c);
        }
    }
}
