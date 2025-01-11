class Solution {


    public int numberOfWays(int n, int x) {
        Long[][] dp = new Long[n+1][n+1];
        long ans = recurse(n , x , 1 , dp)%1000000007;
        

        return (int)ans;
    }

    public static long recurse(int n , long x , int curNum , Long[][] dp){


        if(n == 0){
            return 1;
        }

        if((long)Math.pow(curNum , x) > n){
            return 0;
        }
        if(dp[n][curNum] != null){
            return dp[n][curNum];
        }

        int num = (int)Math.pow(curNum , x);

        long pick = recurse(n-num , x , curNum+1 ,dp);
        long notPick = recurse(n , x , curNum+1 , dp);

        dp[n][curNum] = pick + notPick;
        return dp[n][curNum];


    }

}