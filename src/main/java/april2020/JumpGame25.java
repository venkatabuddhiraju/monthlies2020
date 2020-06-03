package april2020;

/**
 * Jump Game
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Determine if you are able to reach the last index.
 *
 * Example 1:
 *
 * Input: [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 *
 * Input: [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum
 *              jump length is 0, which makes it impossible to reach the last index.
 */
public class JumpGame25 {
    public static void main(String[] asddsds){
        int a[] = {1,2,3};
        System.out.println(new JumpGame25().canJumpInter(new int[]{3,2,1,0,4}));
    }

    public boolean canJumpInter(int[] nums){
        if (nums.length == 0)
            throw new IllegalArgumentException("nums can't be empty");
        int farthest = 0;
        for (int i = 0; i <= farthest && i < nums.length; ++i) {
            farthest = Math.max(farthest, i + nums[i]);
        }
        return farthest >= nums.length - 1;

    }
    public boolean canJump(int[] nums) {
        int[] possibilities = new int[nums.length];
        possibilities[nums.length - 1] = 1;
        for(int i=nums.length -2; i >= 0; i--){
            int maxJump = Math.min(i + nums[i], nums.length - 1);
            for(int j = i+1; j<=maxJump; j++){
                if(possibilities[j] == 1){
                    possibilities[i] = 1;
                }
            }
            if(possibilities[i] != 1){
                possibilities[i] = -1;
            }
        }
        if(possibilities[0] == 1){
            return true;
        }
        return false;
        //return helper_mem(0, nums);
    }

    public boolean canJumpFromPosition(int position, int[] nums) {
        if (position == nums.length - 1) {
            return true;
        }

        int furthestJump = Math.min(position + nums[position], nums.length - 1);
        for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
            if (canJumpFromPosition(nextPosition, nums)) {
                return true;
            }
        }

        return false;
    }

    boolean helper (int currIndex, int[] nums){
        if(currIndex == nums.length - 1){
            return true;
        }
        int maxJumpIndex = Math.min(nums.length - 1, currIndex + nums[currIndex]);
        for(int i = currIndex + 1; i <= maxJumpIndex; i++){
            if(helper(i, nums)){
                return true;
            }
        }
        return false;
    }

    boolean helper_mem (int currIndex, int[] nums){
        int[] mem = new int[nums.length];
        mem[nums.length - 1] = 1;
        if(mem[currIndex] == 1){
            return true;
        }
        int maxJumpIndex = Math.min(nums.length - 1, currIndex + nums[currIndex]);
        for(int i = currIndex + 1; i <= maxJumpIndex; i++){
            if(helper_mem(i, nums)){
                mem[currIndex] = 1;
                return true;
            }
        }
        mem[currIndex] = -1;
        return false;
    }


}
