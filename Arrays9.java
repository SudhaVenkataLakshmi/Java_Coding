public class Arrays9 {
    public static void main(String[] args) {
        int[] arr = {12,6,9,10,4,3,10,7};
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secLargest && arr[i] != largest){
                secLargest = arr[i];
            }
        }
        System.out.println("Second largest Element: " +secLargest);
    }
}
