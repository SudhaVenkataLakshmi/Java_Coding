public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {568,543,2457,8986,25434};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
