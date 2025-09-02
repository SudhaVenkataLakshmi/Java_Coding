import java.util.Scanner;

public class Armstrong {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int num = sc.nextInt();
        int original = num;
        int result = 0;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, digits);
            num /= 10;
        }
        if(result == original){
            System.out.println(original+ " is an Armstrong Number");
        }else{
            System.out.println(original+ " is not an Armstrong Number");
        }
      sc.close();  
    }
}
