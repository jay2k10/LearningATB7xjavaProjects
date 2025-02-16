package forInterview._04022025.array;

import java.util.Arrays;

public class ShiftZeroAtLast {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 0, 6, 0, 8, 0, 9};
        int size = arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.println("Lenght of an array is :" + size);
        int nonZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZero] = arr[i];
                nonZero++;
            }

        }
        while(nonZero< arr.length){
            arr[nonZero]=0;
            nonZero++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
