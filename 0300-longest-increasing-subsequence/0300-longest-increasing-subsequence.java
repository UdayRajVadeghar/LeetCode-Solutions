class Solution {

    //Recursion TLE
    // public int lengthOfLIS(int[] nums) {
        
    //     Integer[][] dp = new Integer[nums.length+1][nums.length+1];
    //     return recurse(nums,0,0,Integer.MIN_VALUE,-1,dp);
        
    // }
    // public static int recurse(int[] nums , int index , int length , int lastPicked , int lastPickedIndex , Integer[][] dp){

    //     if(index == nums.length){
    //         return length;
    //     }
        
    //     if(dp[index][lastPickedIndex+1] != null){
    //         return dp[index][lastPickedIndex+1];
    //     }
    //     int left = 0;

    //     if (lastPickedIndex == -1 || lastPicked < nums[index]) {
    //         left = recurse(nums, index + 1, length + 1, nums[index], index, dp);
    //     }   

    //     int right = recurse(nums,index+1,length,lastPicked,lastPickedIndex,dp);
        

        
    //     dp[index][lastPickedIndex+1] = Math.max(left , right);

    //     return dp[index][lastPickedIndex+1];

    // }

    public int lengthOfLIS(int[] nums) {
        
        Integer[][] dp = new Integer[nums.length+1][nums.length+1];
        return recurse(nums,0,-1,dp);
        
    }
    public static int recurse(int[] nums , int index , int lastPickedIndex , Integer[][] dp){

        if(index >= nums.length){
            return 0;
        }

        if(dp[index][lastPickedIndex+1] != null){

            return dp[index][lastPickedIndex+1];
        }

        int pick = 0;

        if(lastPickedIndex == -1 || nums[lastPickedIndex] < nums[index]){

            pick = 1+recurse(nums,index+1,index,dp);

        }

        int notPick = recurse(nums,index+1,lastPickedIndex,dp);

        dp[index][lastPickedIndex+1] = Math.max(pick , notPick);

        return dp[index][lastPickedIndex+1];

    }
}