class Solution {

    //TLE recursion
    // public int minimumTotal(List<List<Integer>> triangle) {

    //     return recurse(triangle , triangle.size(), 0 , 0);
        
    // }
    // public static int recurse(List<List<Integer>> triangle , int height , int level , int index){

    //     if(level == height){
    //         return 0;
    //     }

    //     int left = triangle.get(level).get(index) + recurse(triangle , height , level+1 , index);
    //     int right = triangle.get(level).get(index) + recurse(triangle , height , level+1 , index + 1);

    //     return Math.min(left , right);
        
    // }

    public int minimumTotal(List<List<Integer>> triangle) {

        Integer[][] dp = new Integer[triangle.size() + 1][triangle.get(triangle.size()-1).size() + 1];
        return recurse(triangle , triangle.size(), 0 , 0 , dp);
        
    }
    public static int recurse(List<List<Integer>> triangle , int height , int level , int index , Integer[][] dp){

        if(level == height){
            return 0;
        }

        if(dp[level][index] != null){
            return dp[level][index];
        }

        int left = triangle.get(level).get(index) + recurse(triangle , height , level+1 , index ,dp);
        int right = triangle.get(level).get(index) + recurse(triangle , height , level+1 , index + 1, dp);

        dp[level][index] = Math.min(left , right);

        return dp[level][index];
        
    }
}