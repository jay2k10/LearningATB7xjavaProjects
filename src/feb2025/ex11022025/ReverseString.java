package feb2025.ex11022025;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "pranavi Rani";
        System.out.println("Original string is :"+s1);
        String s2 = "";
        char c;

        for (int i = 0; i < s1.length(); i++) {
            c= s1.charAt(i);
            s2 = c+s2;

        }
        System.out.println("New string is :"+s2);
    }
}
