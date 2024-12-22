package Dec_2024.WhileLoop;

import java.awt.*;
import java.util.Scanner;

public class Lab016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value, i will tell you the factorial value");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
