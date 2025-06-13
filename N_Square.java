import java.util.Scanner;

public class N_Square {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = scanner.nextInt();
        if(n>0){
            int res = n*n;
            System.out.println("Sqauare of " +n+ " is: " +res);
        }else{
            System.out.println("Please Enter a Positive Number.");
        }
        scanner.close();
    }
}
