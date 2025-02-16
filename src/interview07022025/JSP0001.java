package interview07022025;

import java.util.Arrays;

public class JSP0001 {
    public static void main(String[] args) {
        String str = "this is india";
        String [] str2 =str.split("\s");
//        for (String s:str2){
//            System.out.println(s);
//        }
        for (int i = str2.length; i >0; i--) {
            StringBuilder sb = new StringBuilder();
            sb.reverse();
            String str3 =sb.toString();
            System.out.println(str3);

        }
        //System.out.println(str3);

    }
}
