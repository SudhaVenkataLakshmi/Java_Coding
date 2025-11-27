public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {15,7,9,3,23,34,72};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
