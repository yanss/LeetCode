/*
 * [657] Judge Route Circle
 *
 * https://leetcode.com/problems/judge-route-circle/description/
 *
 * algorithms
 * Easy (68.37%)
 * Total Accepted:    67.3K
 * Total Submissions: 98.5K
 * Testcase Example:  '"UD"'
 *
 * 
 * Initially, there is a Robot at position (0, 0). Given a sequence of its
 * moves, judge if this robot makes a circle, which means it moves back to the
 * original place. 
 * 
 * 
 * 
 * The move sequence is represented by a string. And each move is represent by
 * a character. The valid robot moves are R (Right), L (Left), U (Up) and D
 * (down). The output should be true or false representing whether the robot
 * makes a circle.
 * 
 * 
 * Example 1:
 * 
 * Input: "UD"
 * Output: true
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: "LL"
 * Output: false
 * 
 * 
 */
class Solution {
    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;
        char[] move;
        move = moves.toCharArray();
        for(int i = 0; i < move.length; i++){
            if(move[i] == 'U'){
                vertical ++;
            }else if(move[i] == 'D'){
                vertical --;
            }else if(move[i] == 'L'){
                horizontal ++;
            }else if(move[i] == 'R'){
                horizontal --;
            }
        }
        return vertical == 0 && horizontal == 0;
    }
}
