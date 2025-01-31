package ex_31012025.interviewQuestions.practice;

import java.util.Arrays;

public class ZeroFirst {
    public static void main(String[] args) {
        int arr[]={0,1,5,2,3,0,7,0};
        System.out.println("Original Array is :"+ Arrays.toString(arr));
        int n = arr.length;
        System.out.println("Length of Array is :"+n);
        int nonZero= n-1;

        for (int i = n-1; i >= 0; i--) {
            if(arr[i]!=0){
                arr[nonZero]=arr[i];
                nonZero--;

            }
            
        }
        while(nonZero>=0){
            arr[nonZero]=0;
            nonZero--;

        }
        System.out.println("Sorted array is :"+Arrays.toString(arr));
    }
}
