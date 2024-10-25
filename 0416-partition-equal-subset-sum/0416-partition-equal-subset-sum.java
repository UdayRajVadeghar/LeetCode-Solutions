class Solution {
    public boolean canPartition(int[] nums) {

        int sum = 0;

        for(int i = 0 ; i < nums.length ; i++){

            sum = nums[i] + sum;
            
        }

        if(sum%2 == 1){
            return false;
        }

        Boolean[][] dp = new Boolean[nums.length][sum];

        return recurse(nums , 0 , sum , 0 , dp);

        
        
        
    }
    public static boolean recurse(int[] nums , int index , int sum , int curSum , Boolean[][] dp){

        if(index >= nums.length){
            if(curSum == sum){
                return true;
            }else{
                return false;
            }
        }
        if(dp[index][curSum] != null){
            return dp[index][curSum];
        }
        if(curSum > sum){
            return false;
        }

        boolean pick = recurse(nums , index + 1 , sum - nums[index] , curSum + nums[index] , dp);
        boolean notPick = recurse(nums, index + 1, sum , curSum , dp);

        dp[index][curSum] = pick || notPick;

        return dp[index][curSum];
        


    }
}