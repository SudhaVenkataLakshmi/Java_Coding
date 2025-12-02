public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {10,45,30,20,13,35,6,8,9};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
