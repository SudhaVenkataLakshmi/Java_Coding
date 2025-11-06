public class CheckSortedArray {
    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) { 
                return false;
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        int arr1[] = {2,7,5,1,12,8,9};
        int arr2[] = {5,7,9,10,13};

        System.out.println("arr1 is sorted? " + isSorted(arr1));
        System.out.println("arr2 is sorted? " + isSorted(arr2));
    }
}
