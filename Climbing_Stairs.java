import java.util.Scanner;

public class Climbing_Stairs {

    public static int climbStairs(int n) {

        if(n <= 2) {
            return n;
        }

        int first = 1;
        int second = 2;

        for(int i = 3; i <= n; i++) {

            int third = first + second;

            first = second;
            second = third;
        }

        return second;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = climbStairs(n);

        System.out.println(result);

        sc.close();
    }
}