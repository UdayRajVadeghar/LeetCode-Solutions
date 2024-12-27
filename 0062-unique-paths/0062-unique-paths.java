class Solution {
    public int uniquePaths(int m, int n) {
        
        Integer[][] dp = new Integer[m][n];
        return recurse(m-1 , n-1 , 0 , 0 , dp);
        
    }
    public static int recurse(int m , int n , int x , int y , Integer[][] dp){

        if(x > m || y > n){
            return 0;
        }

        if(x == m && y == n){
            return 1;
        }

        if(dp[x][y] != null){
            return dp[x][y];
        }

        int left = recurse(m , n , x+1,y ,dp);
        int right = recurse(m , n , x , y+1 , dp);

        dp[x][y] = left + right;
        return dp[x][y];


    }
}