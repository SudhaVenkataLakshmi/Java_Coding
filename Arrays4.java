public class Arrays4{
    public static void main(String[] args) {
        int[] arr = {15,10,9,4,7,18,30};
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element: " +min);
    }
}