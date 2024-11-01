class Solution {

    //Recursive TLE
    // public int climbStairs(int n) {
        
    //     return ways(n);

    // }
    // public static int ways(int n){

    //     if(n == 0){
    //         return 1;
    //     }
        
    //     if(n == 1){
    //         return ways(n-1);
    //     }else{

    //         return ways(n-1) + ways(n-2);

    //     }

    // }

    public int climbStairs(int n) {

        Integer[] dp = new Integer[n+1];

        return ways(n,dp);

        
    }
    public static int ways(int n , Integer[] dp){

        if(n == 0 || n == 1){
            return 1;
        }

        if(dp[n] != null){
            return dp[n];
        }

        dp[n] = ways(n-1 , dp) + ways(n-2 , dp);

        return dp[n];


    }
}