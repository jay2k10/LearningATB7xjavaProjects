package ex_30012025;

import java.util.Arrays;

public class _ShiftZerosToFront {
    public static void  _ShiftZerosToFront(int arr []) {
        int n = arr.length;
        int nonZero = n-1;
        for (int i = n-1; i >=0 ; i--) {
            if (arr[i] != 0) {

                arr[nonZero]=arr[i];
                nonZero--;
            }

        }
        while (nonZero>=0){
            arr[nonZero]=0;
            nonZero--;
        }

    }

    public static void main(String[] args) {
        int arr [] = {1,0,3,9,4,0,15,0};
        _ShiftZerosToFront(arr);
        System.out.println(Arrays.toString(arr));
    }
}
