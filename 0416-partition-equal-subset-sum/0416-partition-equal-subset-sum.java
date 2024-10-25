class Solution {
    public boolean canPartition(int[] nums) {

        int sum = 0;

        for(int i = 0 ; i < nums.length ; i++){

            sum = sum + nums[i];
        }

        if(sum%2 == 1){
            return false;
        }

        int target = sum/2;

        Boolean[][] dp = new Boolean[nums.length+1][target+1];

        return recurse(nums , target , 0 , 0 , dp);
        
    }
    public static boolean recurse(int[] nums , int target , int index , int curSum , Boolean[][] dp){


        if(index >= nums.length){

            if(curSum == target){
                return true;
            }else{
                return false;
            }

        }

        if(curSum > target){
            return false;
        }

        if(dp[index][curSum] != null){
            return dp[index][curSum];
        }

        boolean pick = recurse(nums , target , index + 1 ,curSum + nums[index] , dp);
        boolean notPick = recurse(nums , target , index+1 , curSum , dp);

        dp[index][curSum] = pick || notPick;

        return dp[index][curSum];


    }
}