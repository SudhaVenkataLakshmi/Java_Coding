import java.util.Scanner;
import java.util.*;

public class MinBase {
        static boolean allDigitsSame(int M, int B){
            Set<Integer> digits = new HashSet<>();
            int temp = M;
            while(temp > 0){
                digits.add(temp % B);
                temp /= B;
            }
            return digits.size() == 1;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int M = sc.nextInt();
            int min_base = 2;
            for(int B = min_base; B<M;B++){
                if(allDigitsSame(M,B)){
                    System.out.println("Minimum Base: "+B);
                    break;
                }
            }
            sc.close();
        }
    }
