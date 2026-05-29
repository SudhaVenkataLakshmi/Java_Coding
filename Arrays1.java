import java.util.Arrays;
public class Arrays1{
    public static void main(String[] args) {
        int[] arr = {20,10,5,15,25,60,90,120};
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}