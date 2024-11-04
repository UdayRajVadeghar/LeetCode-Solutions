class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        Integer[][] dp = new Integer[m+1][n+1];

        return recurse(obstacleGrid,m,n,0,0,dp);
        
    }
    public static int recurse(int[][] obstacleGrid , int m , int n , int row , int col , Integer[][] dp){
        
        if(row > m-1 || col > n-1){
            return 0;
        }

        //when there is an obsticle
        if(obstacleGrid[row][col] == 1){
            return 0;
        }
        if(dp[row][col] != null){
            return dp[row][col];
        }
        
        if(row == m-1 && col == n-1){
            return 1;
        }

        dp[row][col] = recurse(obstacleGrid,m,n,row+1,col,dp) + recurse(obstacleGrid,m,n,row,col+1,dp);
        return dp[row][col];

    }
}