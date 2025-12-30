public class ArraySum {
    public static int calculateSum(int[] arr){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
    public static void main(String [] args){
        int [] arr = {11,30,46,31,45,60,35,18,55,100,120,150,250,210,200};
        System.out.println("Sum of Elements in an Array: " + calculateSum(arr));
    }
}

