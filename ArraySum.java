public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {20,10,5,8,15,19,9,37};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
