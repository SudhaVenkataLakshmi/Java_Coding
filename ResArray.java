public class ResArray {
    public static void main(String[] args){
        int[] arr = {7,8,5,5,9,2,2,0,1,6,7,3};
        int n = arr.length;
        int max_val = 0;
        for(int start = 0; start < n; start++){
            int[] res = new int[n];
            for(int i = 0; i<n; i++){
                res[i] = arr[(start + i) % n];
            }
            int ans = 0;
            int total = 0;
            for(int val : res){
                ans ^= val;
                total += ans;
            }
            max_val = Math.max(max_val, total);
            for(int i = 0; i<n; i++){
                res[i] = arr[(start-i+n) % n];
            }
            ans = 0;
            total = 0;
            for(int val : res){
                ans ^= val;
                total += ans;
            }
            max_val = Math.max(max_val, total);
        }
        System.out.println(max_val);
    }
}
