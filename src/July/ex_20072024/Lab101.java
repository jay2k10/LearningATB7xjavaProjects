package July.ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine(); //it takes spaces between two word
        //String name = sc.next();   // it didn't takes space between two words.
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your salary");
        float salary = sc.nextFloat();
        System.out.println("Your name is: " +name);
        System.out.println("Your age is: " +age);
        System.out.println("Your salary is: " +salary);
        sc.close();
    }
}
