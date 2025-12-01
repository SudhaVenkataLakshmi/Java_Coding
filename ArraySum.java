public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {20,45,25,15,2,5,7,9,14};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
