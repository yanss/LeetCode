class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) return 0;
        else if (length == 1) return nums[0];
        else {
            int[] res = new int[length + 1];
            res[0] = 0;
            res[1] = nums[0];
            for (int i = 2; i <= length; i++) {
                res[i] = Math.max(res[i - 1], res[i - 2] + nums[i-1]);
            }
        return res[length];
        }
    }
}