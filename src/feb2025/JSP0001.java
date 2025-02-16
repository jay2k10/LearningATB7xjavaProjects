package feb2025;

public class JSP0001 {
    public static void main(String[] args) {
        String str = "i live in delhi";
        String str1 = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            str1 = ch + str1;

        }
        System.out.println(str1);
    }
}
