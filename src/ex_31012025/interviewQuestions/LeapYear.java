package ex_31012025.interviewQuestions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year i will tell you- leap year or not :");
        int year = sc.nextInt();

        if((year%400==0 && year%100!=0)||(year%4==0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
