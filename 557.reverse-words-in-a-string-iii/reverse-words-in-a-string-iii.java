/*
 * [557] Reverse Words in a String III
 *
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 *
 * algorithms
 * Easy (60.08%)
 * Total Accepted:    65K
 * Total Submissions: 108.1K
 * Testcase Example:  '"Let\'s take LeetCode contest"'
 *
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Example 1:
 * 
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * 
 * 
 * 
 * Note:
 * In the string, each word is separated by single space and there will not be
 * any extra space in the string.
 * 
 */
class Solution {
    public String reverseWords(String s) {
		String words[] = s.split(" ");
		StringBuilder res = new StringBuilder();
		for (String word : words)
			res.append(new StringBuffer(word).reverse().toString() + " ");
		return res.toString().trim(); //trim()方法返回调用字符串对象的一个副本，但是所有起始和结尾的空格都被删除了
	}
}
