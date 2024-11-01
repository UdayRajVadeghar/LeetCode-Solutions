class Solution {

    //Recursive TLE
    // public int rob(int[] nums) {

    //     return recurse(nums , nums.length-1);
        
    // }
    // public static int recurse(int[] nums , int index){

    //     if(index < 0){
    //         return 0;
    //     }

    //     //rob
    //     int rob = nums[index] + recurse(nums,index-2);
    //     int notRob = recurse(nums,index-1);

    //     return Math.max(rob,notRob);
        

    // }

    public int rob(int[] nums) {

        Integer[] dp = new Integer[nums.length+1];
        return recurse(nums,nums.length-1,dp);        
    }
    public static int recurse(int[] nums , int index , Integer[] dp){

        if(index < 0){
            return 0;
        }


        if(dp[index] != null){
            return dp[index];
        }


        int rob = nums[index] + recurse(nums,index-2,dp);
        int notRob = recurse(nums,index-1,dp);

        dp[index] = Math.max(rob,notRob);

        return dp[index];

    }
}