public class Arrays4{
    public static void main(String[] args) {
        int[] arr = {20,40,10,50};
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Element: " +min);
    }
}