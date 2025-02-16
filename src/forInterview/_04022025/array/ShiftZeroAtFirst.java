package forInterview._04022025.array;

import java.util.Arrays;

public class ShiftZeroAtFirst {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 0, 6, 0, 8, 0, 9};
        int size = arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.println("Lenght of an array is :" + size);

        int nonZero = size - 1;
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[nonZero] = arr[i];
                nonZero--;

            }

        }
        while(nonZero>=0){
            arr[nonZero]=0;
            nonZero--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
