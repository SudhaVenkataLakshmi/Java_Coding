public class CountSubString {
    public static void main(String[] args) {
        String s = "This is simple";
        String sub = "is";
        int count = 0;

        for(int i = 0; i <= s.length() - sub.length(); i++) {
            if(s.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}
