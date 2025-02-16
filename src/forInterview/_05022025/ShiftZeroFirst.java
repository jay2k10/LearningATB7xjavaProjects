package forInterview._05022025;

import java.util.Arrays;

public class ShiftZeroFirst {
    public static void main(String[] args) {
        int [] arr = {1,5,6,2,0,3,0,37,5};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int nonZero = n-1;
        for (int i = n-1; i >=0 ; i--) {
            if(arr[i]!=0){
                arr[nonZero]=arr[i];
                nonZero--;
            }

        }
        while (nonZero>=0){
            arr[nonZero]=0;
            nonZero--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
