package ex_30012025;

public class _ReverseString {
    public static void main(String[] args) {
        String s ="i am jay";
        System.out.println("Original string is :"+s);
        String s2 ="";
        char ch;
        for (int i =0; i<s.length();i++){
        ch = s.charAt(i);
        s2 = ch+s2;

    }
        System.out.println(s2);
    }
}
