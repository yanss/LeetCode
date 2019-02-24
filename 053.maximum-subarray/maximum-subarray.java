/*
 * [53] Maximum Subarray
 *
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (40.25%)
 * Total Accepted:    296.5K
 * Total Submissions: 736.4K
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 *
 * Find the contiguous subarray within an array (containing at least one
 * number) which has the largest sum.
 *
 *
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 *
 *
 * click to show more practice.
 *
 * More practice:
 *
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 *
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i < nums.length; i++) {
          sum = nums[i] + (sum < 0 ? 0 : sum);
          max = sum > max ? sum : max;
        }
        return max;
    }
}
