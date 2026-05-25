public class Arrays6 {
    public static void main(String[] args) {
        int[] arr = {12,5,6,8,11,3,10,16};
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
