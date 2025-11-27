public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {15,6,8,9,20,35,7};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
