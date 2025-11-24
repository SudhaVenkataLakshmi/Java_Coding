public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {23,67,89,34,28,89,134};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
