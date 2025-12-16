
import java.util.*;
public class BinaryDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<t; i++){
            String A = sc.next();
            String B = sc.next();
            int a = Integer.parseInt(A,2);
            int b = Integer.parseInt(B,2);
            int temp = a+b;
            ans.add(temp);
        }
        System.out.println(ans);
        int maxVal = Collections.max(ans);
        System.out.println(maxVal);
        System.out.println(Integer.toBinaryString(maxVal));
    }
}