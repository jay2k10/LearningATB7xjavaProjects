package ex_31012025.interviewQuestions;

public class ArrayIncreasingOrder {
    public static void main(String[] args) {
        int[] arr = {100, 50, 10, 40, 12, 34, 1};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println("---------------------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
