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
        int arr2[] = {3,6,8,9,10,24};

        System.out.println("arr1 is sorted? " + isSorted(arr1));
        System.out.println("arr2 is sorted? " + isSorted(arr2));
    }
}
