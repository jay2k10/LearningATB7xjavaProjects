package interviewPrep;

public class _SplitString {
    public static void main(String[] args) {
        String split = "Tejaswini Kumari";
        String[] s1 = split.split("\\s");
        for (Object o : s1) {
            System.out.println(o);
        }
    }
}
