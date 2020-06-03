package april2020;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *   Product of Array Except Self
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example:
 *
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
 *
 * Note: Please solve it without division and in O(n).
 *
 * Follow up:
 * Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class ProductExceptSelf15 {

    public static void main(String[] sadkhfddf) {
        int nums[] = {1, 2, 3, 4, 5};
        int nums2[] = new ProductExceptSelf15().productExceptSelf(nums);
        for (int num : nums2) {
            System.out.println(num);
        }
    }

    public int[] productExceptSelf_1(int[] nums) {
        int product = 1, count = 0;
        int nums2[] = new int[nums.length];
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            product = product * num;
        }
        for (int num : nums) {
            if (num == 0) {
                nums2[count++] = product;
                continue;
            }
            nums2[count++] = product / num;
        }

        return nums2;
    }

    public int[] productExceptSelf(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        int leftProduct = 1, rightProduct = 1;
        for (int i = 0, j = nums.length - 1; i < nums.length && j >= 0; i++, j--) {
            leftProduct = leftProduct * nums[i];
            rightProduct = rightProduct * nums[j];
            left.put(i, leftProduct);
            right.put(j, rightProduct);
        }
        int nums2[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int leftVal = left.get(i-1) == null? 1:left.get(i-1);
            int rightVal = right.get(i+1) == null? 1:right.get(i+1);

            nums2[i] = leftVal * rightVal;
        }
        return nums2;
    }
}

