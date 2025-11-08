public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {20,16,5,8,9,19,40};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
