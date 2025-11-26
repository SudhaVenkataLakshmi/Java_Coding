public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {38,20,46,13,23,27,80};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
