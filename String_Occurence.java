
import java.util.Scanner;
public class String_Occurence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String: ");
        String n = sc.nextLine();
        System.out.println("Enter your digit: ");
        char d = sc.next().charAt(0);


        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n.length(); i++){
            if(n.charAt(i) == d){
                String temp = n.substring(0, i) + n.substring(i+1);
                int val = Integer.parseUnsignedInt(temp);
                if(val>max){
                    max = val;
                }
            }
        }
        System.out.println(String.valueOf(max));
    }
}
