/*
 * [28] Implement strStr()
 *
 * https://leetcode.com/problems/implement-strstr/description/
 *
 * algorithms
 * Easy (28.91%)
 * Total Accepted:    258.8K
 * Total Submissions: 895.2K
 * Testcase Example:  '"hello"\n"ll"'
 *
 * 
 * Implement strStr().
 * 
 * 
 * 
 * Return the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 * 
 * 
 * Example 1:
 * 
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * 
 * 
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null) {
            return -1;
        }
        if (haystack.length() == 0 && needle.length() == 0) {
            return 0;
        }
        
        if (haystack.length() == 0) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        
        if (haystack.length() < needle.length()) {
            return -1;
        }
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
}
