package forInterview._04022025.array;

import java.util.Arrays;

public class FrontZero {
    public static void main(String[] args) {
        int [] arr = {5,1,0,2,3,4,0,10,0};
        int n = arr.length;
        System.out.println("Array length is :"+n);
        int nonZero = n-1;
        System.out.println(Arrays.toString(arr));

        for (int i = n-1; i >=0 ; i--) {
            if(arr[i]!=0){
                arr[nonZero]=arr[i];
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
