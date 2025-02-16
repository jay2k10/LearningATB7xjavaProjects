package forInterview._01022025;

import java.util.Arrays;

public class LastZero {
    public static void main(String[] args) {
        int [] arr = {0,1,6,2,7,2,0,5};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int nonZero =0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[nonZero]=arr[i];
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
