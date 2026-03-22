public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {1,3};
        int N = 3;
        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;
        for(int i = 0; i < arr.length; i++){
            actualSum = actualSum + arr[i];
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number is: " +missingNumber);
    }
}
