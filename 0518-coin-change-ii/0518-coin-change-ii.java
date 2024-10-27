class Solution {

    //using recursion - TLE 
    // public int change(int amount, int[] coins) {
        
    //     int[] count = {0};

    //     recurse(amount,coins,0,count);

    //     return count[0];

    // }
    // public static void recurse(int amount , int[] coins ,int index, int[] count){

    //     if(index >= coins.length){

    //         if(amount == 0){
    //             count[0]++;
    //         }
    //         return;

    //     }

    //     if(amount >= coins[index]){
    //         recurse(amount-coins[index],coins,index,count);
    //     }
    //     recurse(amount,coins,index+1,count);

    // }

    public int change(int amount, int[] coins) {
        
        int[] count = {0};
        Integer[][] dp = new Integer[coins.length+1][amount+1];
        return recurse(amount,coins,0,count,dp);

    }
    public static int recurse(int amount,int[] coins,int index,int[] count , Integer[][] dp){

        if(amount == 0){
            return 1;
        }

        if(index >= coins.length){
            return 0;
        }

        if(dp[index][amount] != null){
            return dp[index][amount];
        }

        int pick = 0;

        if(amount >= coins[index]){
            pick = recurse(amount-coins[index],coins,index,count,dp);
        }

        int notPick = recurse(amount,coins,index+1,count,dp);

        dp[index][amount] = pick+notPick;

        return dp[index][amount]; 
    }
}