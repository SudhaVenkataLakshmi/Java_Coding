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



public class Task{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum = sum + i;
        }
        System.out.println("Sum of 10 numbers: " +sum);
    }
}