public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {5,11,9,3,7,8,12};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
