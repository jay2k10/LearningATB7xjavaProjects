package forInterview._04022025;

import java.util.Locale;

public class palindrom {
    public static void main(String[] args) {
        String str = "Namana";
        String str1 = str.toLowerCase();

        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        String str2 = sb.toString();
        if (str2.equals(str1)) {

            System.out.println("palindrom");
        }else{
            System.out.println("not a palindrom");
        }

    }
}