package ex_30012025;

import java.util.Arrays;

public class MovezeroToStart {

    public static void moveZeroToStart(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 7, 0, 1, 4, 0, 9};
        moveZeroToStart(arr);
        System.out.println(Arrays.toString(arr));
    }
}