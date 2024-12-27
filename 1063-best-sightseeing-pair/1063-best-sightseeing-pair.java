class Solution {


    public int maxScoreSightseeingPair(int[] values){
    int n = values.length;
    int res = Integer.MIN_VALUE;
    int maxLeft = values[0]; //// value[i] + i
    
    for(int i = 1; i < n; i++){
        res = Math.max(res, maxLeft + values[i] - i);
        maxLeft = Math.max(maxLeft, (values[i] + i));
    }
    return res; 
    }
        
    
}