public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {10,45,30,20,40,45,23,34,7,8,3,6};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
