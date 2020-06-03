package april2020;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Subarray Sum Equals K
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 *
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 * Note:
 * The length of the array is in range [1, 20,000].
 * The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */
public class SubArraySumK22 {
    public static void main(String[] asadsd){
        int nums[] = {1,2,3};
        System.out.println(new SubArraySumK22().subarraySum(nums, 3));
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum = sum + nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }

}
