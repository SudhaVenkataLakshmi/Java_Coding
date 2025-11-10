public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {30,25,21,12,17,9,7};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
