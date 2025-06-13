import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter Coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter Coefficient c: ");
        double c = scanner.nextDouble();
        double discriminant = b*b-4*a*c;
        if(a==0){
            System.out.println("Coefficient 'a' cannot be Zero.");
        }else if(discriminant>0){
           double root1 = (-b+Math.sqrt(discriminant))/2*a;
           double root2 = (-b-Math.sqrt(discriminant))/2*a;
           System.out.println("Your roots are Real and Different.");
           System.out.println("Root1 is: " +root1);
           System.out.println("Root2 is: " +root2);
        }else if(discriminant==0){
            double root = -b/(2*a);
            System.out.println("Your Roots are Real and Same");
            System.out.println("Root: " +root);
        }else{
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex and different:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
        scanner.close();
    }
}
