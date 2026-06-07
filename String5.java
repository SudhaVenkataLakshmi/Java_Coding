public class String5 {
     public static void main(String[] args) {

        String str = "Practice makes man Perfect";

        int count = 0;

        for(int i = 0; i < str.length(); i++) {

            char ch = Character.toLowerCase(str.charAt(i));

            if(Character.isLetter(ch) &&
              !(ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u')) {
                count++;
            }
        }

        System.out.println(count);
    }
}
