package interviewPrep;

public class BuilderStringReverse {
    public static void main(String[] args) {
        String s1 = "Priya";
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.reverse();
        System.out.println(sb);
    }
}
