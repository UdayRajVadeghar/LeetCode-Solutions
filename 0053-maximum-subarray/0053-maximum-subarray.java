class Solution {
    public int maxSubArray(int[] nums) {

        int curSum = 0;
        int maxSum = nums[0];

        for(int i = 0 ; i < nums.length ; i++){

            curSum += nums[i];

            maxSum = maxSum < curSum? curSum : maxSum;

            curSum = curSum < 0 ? 0 : curSum;

        }
        
        return maxSum;
    }
}