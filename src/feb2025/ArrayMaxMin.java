package feb2025;

import java.util.Arrays;

public class ArrayMaxMin {
    public static void main(String[] args) {
        int [] arr = {5,10,20,35,65};
        int max =1;
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }


        }
        System.out.println("max is :"+max);
        System.out.println("min is :"+min);
}
}
