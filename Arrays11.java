public class Arrays11 {
    public static void main(String[] args) {
        int[] arr = {1,-3,5,7,8,10,-2,-9,12,-1,-12};
        int positive = 0;
        int negative = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                positive++;
            }else{
                negative++;
            }
        }
        System.out.println("Positive: " +positive);
        System.out.println("Negative: " +negative);
    }
}
