public class LongestSubString {
    public static void main(String[] args) {
        String s = "xyzxyz";
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++) {
            String temp = "";

            for(int j = i; j < s.length(); j++) {
                if(temp.indexOf(s.charAt(j)) != -1)
                    break;

                temp += s.charAt(j);
            }

            if(temp.length() > maxLength)
                maxLength = temp.length();
        }

        System.out.println("Longest length: " + maxLength);
    }
}
