public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {50,10,4,7,12,31,62};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
