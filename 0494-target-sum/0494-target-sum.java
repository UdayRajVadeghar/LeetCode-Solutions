class Solution {

    
    public int findTargetSumWays(int[] nums, int target) {
    
        // Integer dp[][] = new Integer[nums.length+1][]
       int totalSum = Arrays.stream(nums).sum();

       Integer[][] dp = new Integer[nums.length][2*totalSum+1];

       return recurse(nums , target , nums.length-1 , dp , totalSum);

        
    }
    public static int recurse(int[] arr , int target  , int index , Integer[][] dp, int totalSum){

        if(index == -1){
            if(target == 0){
                return 1;
            }
            return 0;
        }

        if (totalSum + target < 0 || totalSum + target >= dp[0].length) {
            return 0; 
        }

        if(dp[index][totalSum+target] != null){
            return dp[index][totalSum+target];
        }

        int count1 = recurse(arr , target-arr[index] , index-1 , dp , totalSum);
        int count2 = recurse(arr , target+arr[index] , index-1 , dp , totalSum);

        dp[index][totalSum+target] = count1 + count2;

        return dp[index][totalSum+target];


    }
}