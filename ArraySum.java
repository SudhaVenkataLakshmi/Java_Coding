public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {12,6,9,8,3,5,2};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
