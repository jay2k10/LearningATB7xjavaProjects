package forInterview._01022025;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10,2,18,5,50,3,7};
        int temp;
        int size = arr.length;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
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
        //System.out.println(arr[size - 2]);
    }
}
