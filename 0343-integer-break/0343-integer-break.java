class Solution {
    public int integerBreak(int n) {
        if(n==2) return 1;
        if(n==3) return 2;
        Integer dp[] = new Integer[n + 1];
        return recurse(n , 1 , dp);
    }
    public static int recurse(int n , int product , Integer[] dp){
        
        if(n < 0){
            return 0;
        }

        if(n == 0){
            return product;
        }

        if(dp[n] != null){
            return dp[n];
        }
        
        int max = Math.max(recurse(n-3 , product*3 , dp) , recurse(n-2 , product * 2 , dp));

        dp[n] = max;

        return max;
    }
}