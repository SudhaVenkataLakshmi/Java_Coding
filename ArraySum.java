public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {34,67,8,24,45,34,28};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
