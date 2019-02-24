class NumArray {

    int[] dp;
    
    public NumArray(int[] nums) {
        int length = nums.length;
        dp = new int[length];
        if (length > 0) {
            dp[0] = nums[0];
        }
        for (int i = 1; i < length; i++) {
            dp[i] = dp[i-1] + nums[i];
        }
    }
    
    // dp[i][j] = dp[0][j] - dp[0][i-1]
    public int sumRange(int i, int j) {
        if (i == 0) {
            return dp[j];
        }
        return dp[j] - dp[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */