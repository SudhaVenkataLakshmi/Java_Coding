public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {11,10,7,4,9,20};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
