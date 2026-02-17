public class CharacterCount {
    public static void main(String[] args){
    String s = "Java123@";
    int upper = 0, lower = 0, digit = 0, special = 0;
    for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        if(Character.isUpperCase(ch))
            upper++;
        else if(Character.isLowerCase(ch))
            lower++;
            else if(Character.isDigit(ch))
                    digit++;
                else 
                    special++;
    }
    System.out.println("UpperCase count: " +upper);
    System.out.println("UpperCase count: " +lower);
    System.out.println("UpperCase count: " +digit);
    System.out.println("UpperCase count: " +special);

  }
}
