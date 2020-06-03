package april2020;

/**
 * /**
 *  * Search in Rotated Sorted Array
 *  * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *  *
 *  * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 *  *
 *  * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *  *
 *  * You may assume no duplicate exists in the array.
 *  *
 *  * Your algorithm's runtime complexity must be in the order of O(log n).
 *  *
 *  * Example 1:
 *  *
 *  * Input: nums = [4,5,6,7,0,1,2], target = 0
 *  * Output: 4
 *  * Example 2:
 *  *
 *  * Input: nums = [4,5,6,7,0,1,2], target = 3
 *  * Output: -1
 *
 */
public class SortedRotatedSearch24 {
    public static void main(String[] asds){
        int nums[] = {5,6,7,0,1,2,3,4};
        int nums2[] = {0,1,2,4,5,6,7};
        System.out.println(new SortedRotatedSearch24().search(nums, 4));

    }

    public int search(int[] nums, int target) {
        int l=0, r= nums.length - 1;

        while (l < r){
            int mid = (l + r)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[l] < target){
                if(nums[mid] < target){
                    r = mid - 1;
                }
                else{
                    l = 0;
                }
            }
        }
        return -1;
    }

}
