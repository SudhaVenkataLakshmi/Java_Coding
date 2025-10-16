import java.io.*;
import java.util.*;

public class StringSeparation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int t = 0; t < T; t++){
            String s = sc.nextLine();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 0)
                    even.append(s.charAt(i));
                else
                    odd.append(s.charAt(i));
            }
            System.out.println(even + " " +odd);
        }
        sc.close();
    }
}