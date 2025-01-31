package ex_30012025;

import java.util.Scanner;

public class PalinString {
    public static void main(String[] args) {
        //String str1 = "anna";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = sc.next();
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        String str2 = sb.toString();
        if(str1.equals(str2)){
            System.out.println("Strings are equal");
        }else {
            System.out.println("Not equal");
        }
    }
}
