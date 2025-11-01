public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {5,7,9,12,3,10};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
