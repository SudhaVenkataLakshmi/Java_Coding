import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "care";
        String t = "race";
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Strings are Anagrams");
        }
        else{
            System.out.println("Strings are not Anagrams");
        }
    }
}
