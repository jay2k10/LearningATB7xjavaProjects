package Jan2025.ex_27012025;

import java.sql.SQLOutput;
import java.util.Scanner;

public class A016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        int num1 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 2nd no: ");
        int num2 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter 3rd no: ");
        int num3 = sc1.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num3 && num2 > num1) {
            System.out.println(num2);
        } else {
            System.out.println("Largest no is :");
            System.out.println(num3);
        }
        sc.close();
        sc1.close();
        sc2.close();
    }
}
