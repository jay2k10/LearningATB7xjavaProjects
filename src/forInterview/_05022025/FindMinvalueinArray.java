package forInterview._05022025;

import java.util.Arrays;

public class FindMinvalueinArray {
    public static void main(String[] args) {
        int []arr = {15,20,0,3,9,1};
        System.out.println(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("Min value is : "+min);
    }
}
