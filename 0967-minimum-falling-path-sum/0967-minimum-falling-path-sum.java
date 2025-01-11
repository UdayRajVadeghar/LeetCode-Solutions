class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        
        Integer[][] dp = new Integer[matrix.length+1][matrix[0].length+1];

        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < matrix[0].length ; i++){

            min = Math.min(recurse(matrix, matrix.length - 1 , i , dp) , min);

        }

        return min;

        

    }
    public static int recurse(int[][] matrix , int rowIndex , int colIndex , Integer[][] dp){

        if(colIndex < 0 || colIndex >= matrix[0].length){
            return 12000;
        }

        if(rowIndex < 0){
            return 0;
        }
        if(dp[rowIndex][colIndex] != null){
            return dp[rowIndex][colIndex];
        }

        int min = matrix[rowIndex][colIndex] + Math.min(
            Math.min(
                recurse(matrix, rowIndex - 1, colIndex - 1, dp),
                recurse(matrix, rowIndex - 1, colIndex, dp)
            ),
            recurse(matrix, rowIndex - 1, colIndex + 1, dp)
        );
        

        dp[rowIndex][colIndex] = min;

        return min;

    }   

}