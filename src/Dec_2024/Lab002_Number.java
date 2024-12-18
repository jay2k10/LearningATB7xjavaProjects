package Dec_2024;

import java.util.Scanner;

public class Lab002_Number {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int first_no = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int second_no = sc2.nextInt();

        if(first_no>second_no){
            System.out.println("First no is max");

        }  else
        {
            System.out.println("not max");
        }


    }
}
