#
# [62] Unique Paths
#
# https://leetcode.com/problems/unique-paths/description/
#
# algorithms
# Medium (42.68%)
# Total Accepted:    184.6K
# Total Submissions: 432.6K
# Testcase Example:  '1\n2'
#
# A robot is located at the top-left corner of a m x n grid (marked 'Start' in
# the diagram below).
# 
# The robot can only move either down or right at any point in time. The robot
# is trying to reach the bottom-right corner of the grid (marked 'Finish' in
# the diagram below).
# 
# How many possible unique paths are there?
# 
# 
# 
# Above is a 3 x 7 grid. How many possible unique paths are there?
# 
# 
# Note: m and n will be at most 100.
#
class Solution:
    def uniquePaths(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        return int(math.factorial(m+n-2)/math.factorial(m-1)/math.factorial(n-1))
