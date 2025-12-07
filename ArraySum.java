public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {10,40,55,13,34,39,20,28};
        System.out.println("Sum of Elements in an Array: " + calculateSum(arr));
    }
}

