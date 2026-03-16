public class MaxSubArraySum {

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = arr[0];
        int currentSum = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(currentSum + arr[i] > arr[i]){
                currentSum = currentSum + arr[i];
            }
            else{
                currentSum = arr[i];
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        System.out.println("Maximum Sub Array Sum: " +maxSum);
    }
}