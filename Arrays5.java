public class Arrays5 {
    public static void main(String[] args) {
        int[] arr = {11,7,9,14,12,90,18};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}
