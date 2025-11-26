public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {100,45,6,7,23,678};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
