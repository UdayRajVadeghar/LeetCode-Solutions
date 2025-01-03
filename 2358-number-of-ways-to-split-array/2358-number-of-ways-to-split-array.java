class Solution {
    public int waysToSplitArray(int[] nums) {

        long[] prefixSum = new long[nums.length];

        for(int i = 0 ; i < prefixSum.length ; i++){

            if(i == 0){
                prefixSum[i] = nums[i];
            }else{
                prefixSum[i] = nums[i] + prefixSum[i-1];
            }

        }

        int count = 0;

        for(int i = 0 ; i < prefixSum.length - 1; i++){

            long frontSum = prefixSum[i];
            long backSum = prefixSum[nums.length-1] - prefixSum[i];

            if(frontSum >= backSum){
              
                count++;
            } 

        }

        return count;

        
    }
}