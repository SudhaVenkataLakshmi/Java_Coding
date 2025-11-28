public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {25,60,8,5,3,41,436,27};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
