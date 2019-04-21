/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 *
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (42.56%)
 * Total Accepted:    542.2K
 * Total Submissions: 1.3M
 * Testcase Example:  '121'
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome
 * when it reads the same backward as forward.
 * 
 * Example 1:
 * 
 * 
 * Input: 121
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a
 * palindrome.
 * 
 * 
 * Follow up:
 * 
 * Could you solve it without converting the integer to a string?
 * 
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = 0;
        int tmp = x;
        while(x != 0) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        if (y == tmp) {
            return true;
        }
        return false;
    }
}

