import java.util.Scanner;

public class XpowerY {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X value: ");
        double x = scanner.nextDouble();
        System.out.print("Enter Y value: ");
        double y = scanner.nextDouble();
        double power = Math.pow(x, y);
        System.out.println(x+ "is raised to the power " +y+ "is: " +power);
        scanner.close();
    }
}
