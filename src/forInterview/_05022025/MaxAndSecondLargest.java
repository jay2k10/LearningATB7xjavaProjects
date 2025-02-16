package forInterview._05022025;

import java.util.Arrays;

public class MaxAndSecondLargest {
    public static void main(String[] args) {
        int [] arr = {15,12,3,100,400,2,500,20};
        System.out.println(Arrays.toString(arr));

        int max = 0;
        int sMax =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                sMax=max;
                max= arr[i];
            }

        }
        System.out.println("Max value is :"+max);
        System.out.println("2nd max value is :"+sMax );
    }
}
