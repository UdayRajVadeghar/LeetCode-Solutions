class Solution {


    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        Integer[][] dp = new Integer[m+1][n+1];

        return recurse(grid,m,n,0,0,0,dp);
        
        
    }
    public static int recurse(int[][] grid , int m , int n , int row , int col , int cost , Integer[][] dp){

        if(row >= m || col >= n){
            return Integer.MAX_VALUE;
        }

        

        if(row == m-1 && col == n-1){
            return cost + grid[row][col];
        }

        int minCost = Integer.MAX_VALUE;

        minCost = Math.min(recurse(grid,m,n,row+1,col,cost + grid[row][col],dp) , recurse(grid,m,n,row,col+1,cost+grid[row][col],dp));
        dp[row][col] = minCost;
        return dp[row][col];

    }
}