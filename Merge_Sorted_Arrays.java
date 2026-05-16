import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sorted_Arrays {
     public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Merge from end
        while(i >= 0 && j >= 0) {

            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            }
            else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // Copy remaining nums2 elements
        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input m
        int m = sc.nextInt();

        int[] nums1 = new int[m + 10];

        // Input first array elements
        for(int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input n
        int n = sc.nextInt();

        int[] nums2 = new int[n];

        // Input second array elements
        for(int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Resize nums1 correctly
        nums1 = Arrays.copyOf(nums1, m + n);

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));

        sc.close();
    }
}

