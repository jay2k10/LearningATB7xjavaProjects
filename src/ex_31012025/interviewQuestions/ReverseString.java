package ex_31012025.interviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "I AM JAY";
        String s2 ="";
        char ch;
        System.out.println("Original String is :"+s1);
        for (int i = 0; i < s1.length(); i++) {
            ch = s1.charAt(i);
            s2 = ch+s2;

        }
        System.out.println("Reverse string is :"+s2);
    }
}
