class Solution {

    //recursive TLE

    // public int longestCommonSubsequence(String text1, String text2) {

    //     return lcs(text1,text2,text1.length(),text2.length());
        
    // }
    // public int lcs(String text1 , String text2 , int n , int m){

    //     if(n == 0 || m ==0){

    //         return 0;

    //     }

    //     if(text1.charAt(n-1) == text2.charAt(m-1)){

    //         return 1 + lcs(text1,text2,n-1,m-1);

    //     }else{

    //         return Math.max(lcs(text1,text2,n-1,m) , lcs(text1,text2,n,m-1));

    //     }

    // }

    public int longestCommonSubsequence(String text1, String text2) {

        Integer[][] dp = new Integer[text1.length()+1][text2.length()+1];

        return lcs(text1,text2,text1.length(),text2.length() , dp);
        
    }
    public static int lcs(String text1 , String text2 , int n , int m , Integer[][] dp){

        if(n==0 || m ==0){
            return 0;
        }

        if(dp[n][m] != null){
            return dp[n][m];
        }

        

        if(text1.charAt(n-1) == text2.charAt(m-1)){

            int common = 1 + lcs(text1,text2,n-1,m-1,dp);
            return dp[n][m] = common;
        }else{
            int uncommon = Math.max(lcs(text1,text2,n-1,m,dp) , lcs(text1,text2,n,m-1,dp));
            return dp[n][m] = uncommon;
        }

        

        


    }
}