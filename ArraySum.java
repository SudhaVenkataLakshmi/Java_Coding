public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {11,30,34,30,46,31,45,70,65};
        System.out.println("Sum of Elements in an Array: " + calculateSum(arr));
    }
}

