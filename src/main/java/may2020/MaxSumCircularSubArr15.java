package may2020;

import java.util.Map;

/*
Maximum Sum Circular Subarray
Given a circular array C of integers represented by A, find the maximum possible sum of a non-empty subarray of C.

Here, a circular array means the end of the array connects to the beginning of the array.  (Formally, C[i] = A[i] when 0 <= i < A.length, and C[i+A.length] = C[i] when i >= 0.)

Also, a subarray may only include each element of the fixed buffer A at most once.  (Formally, for a subarray C[i], C[i+1], ..., C[j], there does not exist i <= k1, k2 <= j with k1 % A.length = k2 % A.length.)



Example 1:

Input: [1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3
Example 2:

Input: [5,-3,5]
Output: 10
Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10
Example 3:

Input: [3,-1,2,-1]
Output: 4
Explanation: Subarray [2,-1,3] has maximum sum 2 + (-1) + 3 = 4
Example 4:

Input: [3,-2,2,-3]
Output: 3
Explanation: Subarray [3] and [3,-2,2] both have maximum sum 3
Example 5:

Input: [-2,-3,-1]
Output: -1
Explanation: Subarray [-1] has maximum sum -1


Note:

-30000 <= A[i] <= 30000
1 <= A.length <= 30000
 */
public class MaxSumCircularSubArr15 {

    public static void main(String[] asdsdsds){
        int a[] = {5,-3,5};
        System.out.println(new MaxSumCircularSubArr15().maxSubarraySumCircular(a));
    }

    public int maxSubarraySumCircular(int[] A) {
        if(A.length == 1){
            return A[0];
        }
        int sum = A[0], maxSum = A[0], i = 1, initIndex = 0;
        boolean pastCircle = false;
        while(true){
            if(pastCircle && i == initIndex){
                break;
            }
            if(A[i] > sum + A[i]){
                sum = A[i];
                initIndex = i;
            }
            else{
                sum = sum + A[i];
            }
            //sum = Math.max(A[i],sum + A[i]);
            maxSum = Math.max(sum, maxSum);
            if(i == A.length - 1){
                pastCircle = true;
                i = 0;
                continue;
            }
            i++;
        }
        return maxSum;
    }

}







