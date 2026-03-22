public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7};
        int N = 7;
        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;
        for(int i = 0; i < arr.length; i++){
            actualSum = actualSum + arr[i];
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number is: " +missingNumber);
    }
}
