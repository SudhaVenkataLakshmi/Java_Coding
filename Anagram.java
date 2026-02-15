import java.util.Arrays;
public class Anagram {
    public static void main(String[] args){
        String s1 = "Java is Easy";
        String s2 = "Easy is Java";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2))
            System.out.println("Anagram");
        else 
            System.out.println("Not Anagram");
    }
}
