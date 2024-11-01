class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        Integer[] dp1 = new Integer[nums.length+1];
        Integer[] dp2 = new Integer[nums.length+1];
        return Math.max(recurse(nums,nums.length-2,dp1,0),recurse(nums,nums.length-1,dp2,1));        
    }
    public static int recurse(int[] nums , int index , Integer[] dp , int end){

        if(index < end){
            return 0;
        }


        if(dp[index] != null){
            return dp[index];
        }


        int rob = nums[index] + recurse(nums,index-2,dp,end);
        int notRob = recurse(nums,index-1,dp,end);

        dp[index] = Math.max(rob,notRob);

        return dp[index];

    }
}