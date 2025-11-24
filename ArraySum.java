public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {30,9,35,27,20,25};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
