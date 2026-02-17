// public class Task {
//     public static void main(String[] args){
//         for(int i = 1; i <= 10; i++){
//             if(i % 2 == 0){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

import java.util.Scanner;

public class Task{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n Value: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of 10 numbers: " +sum);
    }
}