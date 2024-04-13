public class Main {
    private String str;
    private char Lastchar;

    public static boolean IsPalindrome(String args) {
        IsPalindrome(String str){
            if (str.length() <= 1) {
                return true;
            }
            else{
                char firstChar = str.charAt(0);
                char lastChar = str.charAt(str.length() - 1);
                String mid = str.substring(1, str.length() - 1);
                return(firstChar == Lastchar) && IsPalindrome(mid);
            }
        }
    }

    public static void main(String[] args) {
        String testStr = "kazak";
        if (IsPalindrome(testStr)){
            System.out.println(testStr);
        }
        else{
            System.out.println(testStr);
        }
    }
}