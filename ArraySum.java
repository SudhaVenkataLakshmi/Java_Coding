public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {12,10,5,8,7,3,2};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
