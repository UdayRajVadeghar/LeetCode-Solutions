class Solution {
    public int maximumAmount(int[][] coins) {

        Integer[][][] dp = new Integer[coins.length+1][coins[0].length+1][3];
        
        return recurse(coins , 2 , 0 , 0 , dp );

        
    }
    public static int recurse(int[][] coins , int neutralize , int m , int n , Integer[][][] dp ){

         if(m == coins.length-1 && n == coins[0].length-1){

            if(neutralize > 0 && coins[m][n] < 0){
                return 0;
            }

            return coins[m][n];
        }

        if(n < 0 || m < 0 || m >= coins.length || n >= coins.length){
            return -10000000;
        }

        if(dp[m][n][neutralize]!=null){
            return dp[m][n][neutralize];
        }

       
        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;

        if(coins[m][n] < 0 && neutralize > 0){
            
            //netrailize
            int neudown = recurse(coins , neutralize-1, m+1 , n , dp );
            int neuright = recurse(coins , neutralize-1, m , n+1 , dp );
            int nonNeuDown = coins[m][n] + recurse(coins , neutralize, m+1 , n , dp );
            int nonNeuRight = coins[m][n] + recurse(coins , neutralize , m , n+1 , dp );

            left = Math.max(neudown , neuright);
            right = Math.max(nonNeuDown , nonNeuRight);

            left = Math.max(left , right);
           

        }else{
            left = coins[m][n] + recurse(coins , neutralize , m+1 , n , dp ); //left or down
            right = coins[m][n] + recurse(coins , neutralize , m , n+1 , dp);
        }
        dp[m][n][neutralize] = Math.max(left , right);
       

        return dp[m][n][neutralize];

    }
}