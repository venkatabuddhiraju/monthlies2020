package april2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/**
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */
public class MoverZeros4 {

    public static void main(String []snadf){
        int nums[] = {-2,1,0,-3,0,4,-1,2,1,-5,4};
        moveZeroes(nums);
        for (int num : nums){
            System.out.println(num);
        }
    }

    public static void moveZeroes(int[] nums) {
        List<Integer> nonZeros = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != 0){
                nonZeros.add(nums[i]);
            }
        }
        int nonZeroIndex = 0;
        for(int num : nonZeros){
            nums[nonZeroIndex] = num;
            nonZeroIndex++;
        }
        for(int i = nonZeroIndex; i < nums.length; i++){
            nums[i] = 0;
        }
    }

}
