package forInterview._04022025.array;

import java.util.Arrays;

public class JSP001 {
    public static void main(String[] args) {
        String [] str = {"a","b","c","b","c","d"};
        System.out.println(Arrays.toString(str));

        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                if(str[i]==str[j]){
                    System.out.println("Duplicate Charactors are: "+str[i]);

                }

            }

        }
    }

}
