package forInterview._04022025.array;

import java.util.Arrays;

public class LastZero {
    public static void main(String[] args) {
        int [] arr = {5,1,0,2,3,4,0,10,0};
        System.out.println(Arrays.toString(arr));
        int nonzero=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[nonzero]=arr[i];
                nonzero++;

            }

        }
        while(nonzero< arr.length){
            arr[nonzero]=0;
            nonzero++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
