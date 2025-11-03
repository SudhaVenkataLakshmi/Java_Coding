public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {50,45,7,12,36,42,81};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
