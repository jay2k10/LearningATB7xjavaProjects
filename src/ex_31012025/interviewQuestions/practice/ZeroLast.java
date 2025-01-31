package ex_31012025.interviewQuestions.practice;

import java.util.Arrays;

public class ZeroLast {
    public static void main(String[] args) {
        int arr [] = {0,1,6,0,2,15};
        System.out.println("Original array is :"+ Arrays.toString(arr));
        int n = arr.length;
        System.out.println("Array length is :"+n);
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
        System.out.println("Sorted array is :"+Arrays.toString(arr));
    }
}
