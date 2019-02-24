/*
 * [125] Valid Palindrome
 *
 * https://leetcode.com/problems/valid-palindrome/description/
 *
 * algorithms
 * Easy (26.94%)
 * Total Accepted:    216.7K
 * Total Submissions: 804.5K
 * Testcase Example:  '""'
 *
 * 
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * 
 * 
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * 
 * 
 * 
 * Note:
 * Have you consider that the string might be empty? This is a good question to
 * ask during an interview.
 * 
 * For the purpose of this problem, we define empty string as valid palindrome.
 * 
 */
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char c1 = 0;
            while (start <= end && (c1 = getChar(s, start)) == 0) {
                start++;
            } 
            char c2 = 0;
            while (end >= start && (c2 = getChar(s, end)) == 0) {
                end--;
            }
            if (c1 != c2) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    private char getChar(String s, int index) {
        char ch = s.charAt(index);
        if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
            return ch;
        } else if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch - 'A' + 'a');
        } else {
            return 0;
        }
    }
}
