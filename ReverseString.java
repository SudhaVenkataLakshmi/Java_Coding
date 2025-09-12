import java.util.*;
public class ReverseString {
    public static void main(String [] args){
        String str = "Java Coding";
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        System.out.println("Original: " +str);
        System.out.println("Reversed: " +reversed);
    }
}
