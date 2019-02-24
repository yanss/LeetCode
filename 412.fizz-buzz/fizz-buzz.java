/*
 * [412] Fizz Buzz
 *
 * https://leetcode.com/problems/fizz-buzz/description/
 *
 * algorithms
 * Easy (58.11%)
 * Total Accepted:    111.4K
 * Total Submissions: 191.8K
 * Testcase Example:  '1'
 *
 * Write a program that outputs the string representation of numbers from 1 to
 * n.
 * 
 * But for multiples of three it should output “Fizz” instead of the number and
 * for the multiples of five output “Buzz”. For numbers which are multiples of
 * both three and five output “FizzBuzz”.
 * 
 * Example:
 * 
 * n = 15,
 * 
 * Return:
 * [
 * ⁠   "1",
 * ⁠   "2",
 * ⁠   "Fizz",
 * ⁠   "4",
 * ⁠   "Buzz",
 * ⁠   "Fizz",
 * ⁠   "7",
 * ⁠   "8",
 * ⁠   "Fizz",
 * ⁠   "Buzz",
 * ⁠   "11",
 * ⁠   "Fizz",
 * ⁠   "13",
 * ⁠   "14",
 * ⁠   "FizzBuzz"
 * ]
 * 
 * 
 */
class Solution {
    public  List<String> fizzBuzz(int n) {
        final int size = n;
        return new java.util.AbstractList<String>() {
            public static final String FIZZ_BUZZ = "FizzBuzz";
            public static final String FIZZ = "Fizz";
            public static final String BUZZ = "Buzz";

            @Override
            public String get(int index) {
                index ++;
                if(index % 15 == 0){
                    return FIZZ_BUZZ;
                }else if(index % 3 == 0){
                    return FIZZ;
                }else if(index % 5 == 0){
                    return BUZZ;
                }else{
                    return String.valueOf(index);
                }
            }
            @Override
            public int size() {
                return size;
            }
        };
    }
}
