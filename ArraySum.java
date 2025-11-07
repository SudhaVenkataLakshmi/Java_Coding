public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {50,20,25,3,11,8,56};
        System.out.println("Sum: " + calculateSum(arr));
    }
}
