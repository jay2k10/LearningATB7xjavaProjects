package forInterview._01022025;

import java.util.Arrays;

public class FindDupElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 2, 5, 1, 8};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }

            }

        }
    }
}
