/*
 * [729] My Calendar I
 *
 * https://leetcode.com/problems/my-calendar-i/description/
 *
 * algorithms
 * Medium (42.15%)
 * Total Accepted:    10K
 * Total Submissions: 23.6K
 * Testcase Example:  '["MyCalendar","book","book","book"]\n[[],[10,20],[15,25],[20,30]]'
 *
 *
 * Implement a MyCalendar class to store your events. A new event can be added
 * if adding the event will not cause a double booking.
 *
 * Your class will have the method, book(int start, int end).  Formally, this
 * represents a booking on the half open interval [start, end), the range of
 * real numbers x such that start .
 *
 * A double booking happens when two events have some non-empty intersection
 * (ie., there is some time that is common to both events.)
 *
 * For each call to the method MyCalendar.book, return true if the event can be
 * added to the calendar successfully without causing a double booking.
 * Otherwise, return false and do not add the event to the calendar.
 *
 *
 * Your class will be called like this:
 * MyCalendar cal = new MyCalendar();
 * MyCalendar.book(start, end)
 *
 * Example 1:
 *
 * MyCalendar();
 * MyCalendar.book(10, 20); // returns true
 * MyCalendar.book(15, 25); // returns false
 * MyCalendar.book(20, 30); // returns true
 * Explanation:
 * The first event can be booked.  The second can't because time 15 is already
 * booked by another event.
 * The third event can be booked, as the first event takes every time less than
 * 20, but not including 20.
 *
 *
 *
 * Note:
 * The number of calls to MyCalendar.book per test case will be at most 1000.
 * In calls to MyCalendar.book(start, end), start and end are integers in the
 * range [0, 10^9].
 *
 */
class MyCalendar {

    TreeMap<Integer, Integer> map;
    public MyCalendar() {
      map = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer floor = map.floorKey(end - 1);
        if (floor != null && (floor >= start || map.get(floor) > start))
            return false;
        map.put(start, end);
        return true;
    }
}

/* faster solution, using binary tree
class MyCalendar2 {

    class Node {//节点有起始结束时间和左右子节点
        public Node(int start, int end) {
            l = start;
            r = end;
        }

        int l, r;
        Node left, right;
    }

    Node root = null;

    public boolean book(int start, int end) {
        if (root == null) {
            root = new Node(start, end);
        } else {
            Node cur = root;
            Node pre = null;//父节点
            boolean leftTag = false;//记录该插入的节点是左子还是右子
            while (cur != null) {
                pre = cur;
                if (end <= cur.l) {//应该在当前节点的左侧，往左子递归
                    leftTag = true;
                    cur = cur.left;
                } else if (start >= cur.r) {//应该在当前节点的右侧，往右子递归
                    leftTag = false;
                    cur = cur.right;
                } else {// 有重叠，不应该插入，返回false
                    return false;
                }
            }
            if (leftTag) {//根据tag确定是父亲的左子还是右子
                pre.left = new Node(start, end);
            } else {
                pre.right = new Node(start, end);
            }
        }
        return true;
    }
}
*/

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
