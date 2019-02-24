/*
 * [500] Keyboard Row
 *
 * https://leetcode.com/problems/keyboard-row/description/
 *
 * algorithms
 * Easy (59.86%)
 * Total Accepted:    58.9K
 * Total Submissions: 98.4K
 * Testcase Example:  '["Hello","Alaska","Dad","Peace"]'
 *
 * Given a List of words, return the words that can be typed using letters of
 * alphabet on only one row's of American keyboard like the image
 * below. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * 
 * 
 * 
 * Note:
 * 
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 * 
 * 
 */
class Solution {
    public String[] findWords(String[] words) {
        String line1 = "qwertyuiop", line2 = "asdfghjkl", line3 = "zxcvbnm";
        ArrayList str = new ArrayList();
        for(int i = 0; i < words.length; i++){
            if(containsAll(line1, words[i]) || containsAll(line2, words[i]) || containsAll(line3, words[i])) str.add(words[i]);
        }
        return (String[])str.toArray(new String[str.size()]);   
    }
    
    public boolean containsAll(String line, String words) {
        char c;
        words = words.toLowerCase();
        for(int i = 0; i < words.length(); i++){
            c = words.charAt(i);
            if(line.indexOf(c) == -1) return false;
        }
        return true;
    }
}
