import java.util.Scanner;

public class SwapValues {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b value: ");
        double b = scanner.nextDouble();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
