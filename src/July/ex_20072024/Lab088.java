package July.ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        // Max number in two inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
        // System.out.println(Math.max(num1,num2));
        if(num1>num2){
            System.out.println("number 1 is big");
        } else if (num1<num2) {
            System.out.println("number 2 is big");

        }
        else{
            System.out.println("both are equal");
        }
    }
}
