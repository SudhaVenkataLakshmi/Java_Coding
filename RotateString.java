public class RotateString {
    public static void main(String[] args){
        String s = "xyz";
        int n = 2;
        String part1 = s.substring(n);
        String part2 = s.substring(0,n);
        System.out.println(part1 + part2);
    }
}

