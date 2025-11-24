public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {12,4,6,8,20,53,126,6};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
