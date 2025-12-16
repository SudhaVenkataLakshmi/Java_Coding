import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinNumberArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();

        for(int i = 0; i<n; i++){
            a.add(sc.nextInt());
        }
        int ans = 0;
        Collections.sort(a);

        while (a.isEmpty()) {
            if(!a.get(0).equals(a.size()-1)){
                a.remove(a.size()-1);
                if(!a.isEmpty()){
                    a.remove(0);
                }
            }
            else{
                a.remove(0);
                ans++;
            }
        }
        System.out.println(ans);
    }
}
