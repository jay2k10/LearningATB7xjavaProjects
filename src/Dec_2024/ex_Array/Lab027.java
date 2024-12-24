package Dec_2024.ex_Array;

import java.util.Scanner;

public class Lab027 {
    public static void main(String[] args) {
        float[] marks = new float[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject 1");
        marks[0] = sc.nextFloat();
        //System.out.println(marks1);
        System.out.println("Enter the marks of subject 2");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the marks of subject 3");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the marks of subject 4");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the marks of subject 5");
        marks[4] = sc.nextFloat();

        float avg = (marks[0] + marks[1] + marks[2] + marks[3] + marks[4]) / 5;
        System.out.println(avg);

    }
}
