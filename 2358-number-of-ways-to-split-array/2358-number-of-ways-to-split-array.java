class Solution {
    public int waysToSplitArray(int[] nums) {

       long totalSum = 0;

        for(int i = 0 ; i < nums.length; i++){

            totalSum = totalSum + nums[i];

        }

        long curSum = 0;
        int count = 0;

        for(int i = 0 ; i < nums.length - 1; i++){
            
            curSum = curSum + nums[i];
            long backSum = totalSum - curSum;

            if(curSum >= backSum){
              
                count++;
            } 

        }

        return count;

        
    }
}