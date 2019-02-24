/*
 * [728] Self Dividing Numbers
 *
 * https://leetcode.com/problems/self-dividing-numbers/description/
 *
 * algorithms
 * Easy (66.81%)
 * Total Accepted:    27.4K
 * Total Submissions: 41K
 * Testcase Example:  '1\n22'
 *
 * 
 * A self-dividing number is a number that is divisible by every digit it
 * contains.
 * 
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 ==
 * 0, and 128 % 8 == 0.
 * 
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * 
 * Given a lower and upper number bound, output a list of every possible self
 * dividing number, including the bounds if possible.
 * 
 * Example 1:
 * 
 * Input: 
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * 
 * 
 * 
 * Note:
 * The boundaries of each input argument are 1 .
 * 
 */
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList();
        for(int i = left; i <= right; i++){
            if(selfDividing(i)) nums.add(i);
        }
        return nums;
    }
    
    public boolean selfDividing(int n){
        int x = n;
		while (x > 0) {
			int r = x % 10;
			x /= 10;
			if (r == 0 || n % r > 0)
				return false;
		}
		return true;
    }
    
    /*
    Alternate implementation of selfDividing:
    public boolean selfDividing(int n) {
        for (char c: String.valueOf(n).toCharArray()) {
            if (c == '0' || (n % (c - '0') > 0))
                return false;
        }
        return true;
    }
    */
}
