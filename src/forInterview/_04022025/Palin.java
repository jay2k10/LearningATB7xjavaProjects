package forInterview._04022025;

public class Palin {
    public static void main(String[] args) {
        String str = "naman";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String str1 = sb.toString();
        if (str.equals(str1)) {

            System.out.println("palindrom");
        }else{
            System.out.println("not");
        }
    }
}
