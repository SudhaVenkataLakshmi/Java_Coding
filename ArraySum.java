public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {11,30,46,31,45,60,35,40,31,50,65,120,100,95,48,67,81};
        System.out.println("Sum of Elements in an Array: " + calculateSum(arr));
    }
}

