public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {9,7,6,3,1,3,35,67,2,34};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
