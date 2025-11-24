public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {45,89,2,3,14,679,32};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
