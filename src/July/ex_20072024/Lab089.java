package July.ex_20072024;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("You are Adult");
        }
        else {
            System.out.println("You are children");
        }
    }
}
