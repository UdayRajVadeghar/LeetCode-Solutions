class Solution {
    public int minFallingPathSum(int[][] matrix) {

        int minSum = Integer.MAX_VALUE;

        Integer[][] dp = new Integer[matrix.length + 1][matrix[0].length + 1];

        for(int i = 0 ; i < matrix.length ; i++){

            minSum = Math.min( minSum , recurse(matrix , matrix.length , 0 , i , dp));

        }

        return minSum;
     
        
    }
    public static int recurse(int[][] matrix , int height , int level , int index , Integer[][] dp){


        if(index < 0 || index >= matrix[0].length){

            return Integer.MAX_VALUE;

        }

        if(level == height-1){
            return matrix[level][index];
        }

        if(dp[level][index] != null){
            return dp[level][index];
        }
        
        int left = recurse(matrix , height , level+1 , index-1 , dp);
        int middle = recurse(matrix , height , level+1 , index , dp);
        int right = recurse(matrix , height , level+1 , index+1 , dp);


        int min = matrix[level][index] + Math.min(left , Math.min(middle , right));

        dp[level][index] = min;

        return dp[level][index];

        

    }
}