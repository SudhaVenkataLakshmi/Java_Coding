public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {10,40,50,4,57,82,93,23,40};
        System.out.println("Sum of Elements in an Array: " + calculateSum(arr));
    }
}

