package forInterview._08022025;

public class ReverseString {
    public static void main(String[] args) {
        String str = "i love my india";
        String str1 ="";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            str1 = ch+str1;


        }
        System.out.println();
    }
}
