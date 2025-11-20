public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {30,20,15,34,7,9,5};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
