package ex_30012025;

import java.util.Scanner;

public class Arr001 {
    public static void main(String[] args) {
        //create a program take input from user and give an output from 1 to n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a= new int[n];
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            a[i]=v;


        }
        sc.close();
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
