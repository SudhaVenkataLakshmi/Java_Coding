import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Any Value: ");
        double val = scanner.nextDouble();
        if(val>0){
            double fact = 1;
            for(int i = 1; i <= val; i++){
                fact = fact*i;
            }
            System.out.println("Factorial value for " +val+ " is: " +fact);
        }else{
            System.out.println("Factorial value is not defined for negative numbers.");   
        }
        scanner.close();
    }
}
