package forInterview._04022025.array;

import java.util.Arrays;

public class ArrDec {
    public static void main(String[] args) {
        int [] arr = {1,5,2,4,10,15,7};
        System.out.println(Arrays.toString(arr));

        int temp =0;
        for(int i =0;i< arr.length;i++){
            for (int j = i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
