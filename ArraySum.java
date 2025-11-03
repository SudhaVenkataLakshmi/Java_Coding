public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {20,15,10,9,7,3,5};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
