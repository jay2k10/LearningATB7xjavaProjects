package ex_30012025;

public class PalindromString {
    public static void main(String[] args) {
        String str1 = "anna";
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        String str2 = sb.toString();
        if (str2.equals(str1)){
            System.out.println("Strings are equal");
        }else {
            System.out.println("not equal");
        }
    }
}
