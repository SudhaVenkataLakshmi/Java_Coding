public class Arrays6 {
    public static void main(String[] args) {
        int[] arr = {30,20,45,33,21,18,11,9};
        int even = 0;
        int odd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even ++;
            }else {
                odd ++;
            }
        }
        System.out.println("No. of Even Numvers: " +even);
        System.out.println("No. of Odd Numbers: " +odd);
    }
}
