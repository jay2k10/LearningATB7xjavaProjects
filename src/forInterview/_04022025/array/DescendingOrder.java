package forInterview._04022025.array;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {100, 15, 24, 9, 3, 500, 200, 300};
        int n = arr.length;
        System.out.println(n);
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
