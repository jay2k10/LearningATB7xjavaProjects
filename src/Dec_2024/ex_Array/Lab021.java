package Dec_2024.ex_Array;

public class Lab021 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        System.out.println("Array length is: " + marks.length);
        System.out.println("Before assigning value: " + marks[0]);
        System.out.println("Before assigning value: " + marks[1]);
        System.out.println("Before assigning value: " + marks[2]);

        marks[0] = 90;
        marks[1] = 91;
        marks[2] = 92;

        System.out.println("After assigning value: " + marks[0]);
        System.out.println("After assigning value: " + marks[1]);
        System.out.println("After assigning value: " + marks[2]);


        boolean[] is_married = {true, false, true};

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks is: " + marks[i]);

        }
    }
}
