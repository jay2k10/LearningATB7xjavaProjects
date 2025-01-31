package ex_31012025.interviewQuestions;

public class PalindromString {
    public static void main(String[] args) {
        String s1 = "namana";
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        String s2 = sb.toString();
        if(s1.equals(s2)){
            System.out.println("Strings are palindrome");
        }else {
            System.out.println("Strings are not palindrome");
        }
    }
}
