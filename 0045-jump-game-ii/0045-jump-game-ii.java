class Solution {
    public int jump(int[] nums) {
        Integer[] dp = new Integer[nums.length];
        return recurse(nums, 0, dp);
    }

    public static int recurse(int[] nums, int index, Integer[] dp) {
        // Base case: if we've reached or passed the last index
        if (index >= nums.length - 1) {
            return 0;
        }

        // If we have already computed the result for this index, use it
        if (dp[index] != null) {
            return dp[index];
        }

        int jumps = Integer.MAX_VALUE;

        // Explore all possible jumps from this index
        for (int i = 1; i <= nums[index]; i++) {
            int nextIndex = index + i;
            int jumpResult = recurse(nums, nextIndex, dp);

            // Only consider valid paths
            if (jumpResult != Integer.MAX_VALUE) {
                jumps = Math.min(jumps, 1 + jumpResult);
            }
        }

        // Store the computed result in dp
        dp[index] = jumps;
        return dp[index];
    }
}
