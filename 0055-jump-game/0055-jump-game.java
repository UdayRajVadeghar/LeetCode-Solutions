class Solution {
    public boolean canJump(int[] nums) {

        Boolean[] dp = new Boolean[nums.length+1];

        return recurse(nums , 0 , dp);

        
    }
    public static boolean recurse(int[] nums , int index , Boolean[] dp){


        if(index >= nums.length-1){
            return true;
        }

        if(dp[index] != null){
            return dp[index];
        }
      

        for(int i = 1 ; i <= nums[index] ; i++){

            if(recurse(nums , index + i , dp)){
                return true;
            }

        }

        dp[index] = false;

        return dp[index];
        

    }
}