package april2020;

/**
 * Search in Rotated Sorted Array
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * Example 1:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 0
 * Output: 4
 * Example 2:
 *
 * Input: nums = [4,5,6,7,0,1,2], target = 3
 * Output: -1
 */
public class SortedRotatedSearch19 {

    public static void main(String[] asdljsld){
        int nums[] = {5,6,7,0,1,2,3,4};
        int nums2[] = {4,5,6,7,0,1,2};
        System.out.println(new SortedRotatedSearch19().getPivot(nums2));
//        System.out.println(new SortedRotatedSearch19().binarySearch(nums2, 3));

    }

//    public int search(int[] nums, int target) {
//        int pivot = getPivot(nums);
//        if(target < nums[nums.length - 1]){
//            binarySearch(nums, pivot, )
//        }
//    }

    private int getPivot(int nums[]){
        int left = 0, right = nums.length -1;

        while(left < right){
            int mid = (left + right)/2;
            if(nums[mid] < nums[mid -1] && nums[mid] < nums[mid + 1]){
                return mid;
            }
            else if(nums[mid] > nums[mid - 1]){
                left = mid + 1;
            }
            else if (nums[mid] < nums[mid + 1]){
                right = mid - 1;
            }
        }

        return -1;

    }

    // 5,6,7,0,1,2,3,4
    private int binarySearch(int[] nums, int left, int right, int target){
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < nums[mid -1] && nums[mid] < nums[mid + 1]){
                if(nums[0] > target){
                    left = (mid+1);
                    right = nums.length - 1;
                }
                else{
                    right = mid - 1;
                    left = 0;
                }
            }
            else if(nums[mid] > target){

            }
        }
        return -1;
    }

}
