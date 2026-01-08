public class IndexedArray {
    public static void main(String[] args){
        int n = 7;
        int[] arr = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for(int i=1; i<=n/2;i++){
            arr[i*2] = arr[i];
            if((i*2) + 1 <= n){
                arr[(i*2)+1] = arr[i] + arr[i+1];
            }
        }
        int max = arr[0];
        for(int i=1;i<=n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
