public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {25,20,15,8,9,6,12};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
