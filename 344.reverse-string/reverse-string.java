/*
 * [344] Reverse String
 *
 * https://leetcode.com/problems/reverse-string/description/
 *
 * algorithms
 * Easy (60.19%)
 * Total Accepted:    231K
 * Total Submissions: 383.8K
 * Testcase Example:  '"hello"'
 *
 * Write a function that takes a string as input and returns the string
 * reversed.
 * 
 * 
 * Example:
 * Given s = "hello", return "olleh".
 * 
 */
class Solution {
    public String reverseString(String s) {
        StringBuilder t = new StringBuilder();
        for(int i = s.length()-1; i >= 0 ; i--){
            t.append(s.charAt(i));
        }
        return t.toString();
    }
}
