package april2020;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 *
 * Example 1:
 * Input: [0,1]
 * Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
 * Example 2:
 * Input: [0,1,0,0,0,0,1,0,1]
 * Output: 2
 * Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 * Note: The length of the given binary array will not exceed 50,000.
 */
public class ContArray13 {

    public static void main(String[] skdfdsf){
        int nums[] = {0,1};
        System.out.println(new ContArray13().findMaxLength(nums));
    }


    public int findMaxLengthOne(int[] nums) {
        int maxLength = 0;
        for(int i = 0; i<nums.length; i++){
            int zeroCount = 0, oneCount = 0;
            for(int j=i; j<nums.length; j++){
                if(nums[j] == 0){
                    zeroCount++;
                }
                else if(nums[j] == 1){
                    oneCount++;
                }
                if(oneCount == zeroCount){
                    maxLength = Math.max(zeroCount + oneCount, maxLength);
                }

            }

        }
        return maxLength;
    }

    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> onesZeroes = new HashMap<>();
        int count = 0;
        int maxLen = 0;
        for(int i=0; i<nums.length; i++){
            count = count + (nums[i] == 1 ? 1 : -1);
            if(count == 0){
                maxLen = Math.max(maxLen, i+1);
            }
            if(onesZeroes.containsKey(count)){
                maxLen = Math.max(maxLen, i - onesZeroes.get(count));
            }
            else {
                onesZeroes.put(count, i);
            }
        }
        return maxLen;
    }

    }
