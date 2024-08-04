package July.ex_28072024;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Method to determine if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 400,
        // or it is divisible by 4 but not divisible by 100
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
