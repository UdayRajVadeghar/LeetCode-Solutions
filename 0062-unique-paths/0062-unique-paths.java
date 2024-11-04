class Solution {
    public int uniquePaths(int m, int n) {

        Integer[][] dp = new Integer[m][n];
        return recurse(m,n,0,0,dp);
    }
    public static int recurse(int m , int n , int row , int col , Integer[][] dp){
        

        
        if(row > m-1 || col > n-1){
            return 0;
        }
        if(row == m-1 && col == n-1){
            return 1;
        }
        if(dp[row][col] != null){
            return dp[row][col];
        }

        dp[row][col] =  recurse(m,n,row+1,col,dp) + recurse(m,n,row,col+1,dp);
        return dp[row][col];

    }
}