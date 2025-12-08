public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {11,30,34,7,9,10,3,75};
        System.out.println("Sum of Elements in an Array: " + calculateSum(arr));
    }
}

