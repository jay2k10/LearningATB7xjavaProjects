package interviewPrep;

public class $SplitString {
    public static void main(String[] args) {
        String s1 = "Pranavi Rani";
        String[] word = s1.split("\\s");
        for (String s : word) {
            System.out.println(s);
        }
    }
}
