package ex_31012025.interviewQuestions;

public class SplitString {
    public static void main(String[] args) {
        String s = "My name is Jay Shankar";
        System.out.println("Original String :"+s);
        String [] s2 = s.split("\s");
        for(String w :s2){
            System.out.println("Splitted :"+w);
        }
    }
}
