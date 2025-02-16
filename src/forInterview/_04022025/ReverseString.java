package forInterview._04022025;

public class ReverseString {
    public static void main(String[] args) {
        String str = "my name is jay";
        String str2 = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {
             ch = str.charAt(i);
            str2 = ch+str2;

        }
        System.out.println(str2);
    }
}
