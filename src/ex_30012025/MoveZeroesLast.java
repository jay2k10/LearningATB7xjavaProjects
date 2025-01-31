package ex_30012025;

import java.util.Arrays;

class MoveZeroesLast {

    public static void moveZeroes(int[] nums) {

        // Start with the first position
        int insertPosition = 0;

        for (int i = 0; i < nums.length; i++) {
            // FIll all non-zero numbers
            if (nums[i] != 0) {
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }

        while (insertPosition < nums.length) {
            nums[insertPosition++] = 0;
        }


    }

    public static void main(String[] args) {
        int num [] = {1,4,5,0,2,0,1};
        moveZeroes(num);
        System.out.println(Arrays.toString(num));
    }



}
