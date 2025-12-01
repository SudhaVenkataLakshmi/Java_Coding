public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {15,4,7,8,54,20,35,6,40};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
