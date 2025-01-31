package ex_31012025.interviewQuestions;

public class ReverseBuilder {
    public static void main(String[] args) {
        String s1 = "I AM JAY";
        System.out.println("Original Strig is :"+s1);
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        String s2 = sb.toString();
        System.out.println("Reverse string is :"+s2);

    }
}
