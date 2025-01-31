package interviewPrep;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "Jay Shankar";
        String r = "";
        char c;
        for (int i = 0; i < s1.length(); i++) {
            c = s1.charAt(i);
            r = c + r;

        }
        System.out.println(r);
    }
}
