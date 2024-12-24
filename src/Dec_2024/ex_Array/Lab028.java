package Dec_2024.ex_Array;

import java.util.Scanner;

public class Lab028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5]; // Array to store marks for 5 subjects

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of subject " + (i + 1) + ":");
            marks[i] = sc.nextFloat();
        }

        // Optionally, you can print the marks to verify
        System.out.println("You entered the following marks:");
        for (float mark : marks) {
            System.out.println("Entered marks is :" + mark);
        }
        System.out.println("-------------------------------------------");
        float avg = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;
        System.out.println("Average marks is: " + avg);
        sc.close();
    }
}
