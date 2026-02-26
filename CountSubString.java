public class CountSubString {
    public static void main(String[] args) {
        String s = "Java makes easy to practice";
        String sub = "to";
        int count = 0;

        for(int i = 0; i <= s.length() - sub.length(); i++) {
            if(s.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}
