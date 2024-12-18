package Dec_2024;

import java.util.Scanner;

public class MaxNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter number3: ");
        int num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println(num1);

        } else if (num2 > num3 && num2 >num1) {
            System.out.println(num2);
                   }
        else{
            System.out.println(num3);
        }
    }
}
