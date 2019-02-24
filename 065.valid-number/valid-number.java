/*
 * [65] Valid Number
 *
 * https://leetcode.com/problems/valid-number/description/
 *
 * algorithms
 * Hard (12.94%)
 * Total Accepted:    83.1K
 * Total Submissions: 641.7K
 * Testcase Example:  '"3"'
 *
 * Validate if a given string is numeric.
 * 
 * 
 * Some examples:
 * "0" => true
 * "   0.1  " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * 
 * 
 * Note: It is intended for the problem statement to be ambiguous. You should
 * gather all requirements up front before implementing one.
 * 
 * 
 * 
 * Update (2015-02-10):
 * The signature of the C++ function had been updated. If you still see your
 * function signature accepts a const char * argument, please click the reload
 * button  to reset your code definition.
 * 
 */
class Solution {
    public boolean isNumber(String s) {
		s = s.trim();
		int i = 0;
		boolean isNumber = false;
		if (i < s.length() && ((s.charAt(i) == '-') || s.charAt(i) == '+'))
			i++;
		while (i < s.length() && Character.isDigit(s.charAt(i))) {
			i++;
			isNumber = true;
		}
		if (i < s.length() && s.charAt(i) == '.') {
			i++;
			while (i < s.length() && Character.isDigit(s.charAt(i))) {
				i++;
				isNumber = true;
			}
		}
		if (isNumber && i < s.length() && s.charAt(i) == 'e') {
			i++;
			isNumber = false;
			if (i < s.length() && ((s.charAt(i) == '-') || (s.charAt(i) == '+')))
				i++;
			while (i < s.length() && Character.isDigit(s.charAt(i))) {
				i++;
				isNumber = true;
			}
		}
		return isNumber && i == s.length();
	}
}
