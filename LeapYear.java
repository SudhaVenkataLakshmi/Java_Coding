import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any year: ");
        Double year = scanner.nextDouble();
        if(year%4 == 0 && year % 100 != 0 || (year % 400 == 0)){
            System.out.println("your entered year is Leap Year.");
        }else{
            System.out.println("Your entered year is not Leap Year.");
        }
    }
}
