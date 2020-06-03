package april2020;

/**
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class MaxSubArray3 {

    public static void main(String[] asdksj){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        //System.out.println(maxSubArray(nums));
        System.out.println(maxSubArrayMine(nums));
    }

    public static int maxSubArray(int[] nums) {
        int sum = nums[0], maxSum = nums[0];

        for(int i=1;i<nums.length;i++){
                sum = Math.max(nums[i],sum + nums[i]);
                maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

    public static int maxSubArrayMine(int[] nums) {
        int sum = nums[0], maxSum = nums[0];

        for(int i=1;i<nums.length;i++){

            if(sum + nums[i] < sum){
                sum = sum + nums[i];
            }
            else{
                sum = nums[i];
            }
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }


}
