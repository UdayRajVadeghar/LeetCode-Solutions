class Solution {
    public int climbStairs(int n) {

        int[] dp = new int[n+1];

        recurse( n , dp);

        return dp[n];

        
        
    }

    public static int recurse(int n , int[] dp){

        if(n == 0 || dp[n] != 0){

            if(dp[n] != 0){
                return dp[n];
            }
            return 1;
        }
        if(n == 1){
            dp[1] = 1;
            return 1;
        }
        

        int combo1 = recurse(n - 1 , dp);
        int combo2 = recurse(n - 2 , dp);

        dp[n] = combo1 + combo2;

        return combo1 + combo2;


    }
}