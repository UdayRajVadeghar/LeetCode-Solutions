class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int i = 0;
        
        int sum = 0;
        int length = Integer.MAX_VALUE;

        for(int j = 0 ; j < nums.length ; j++){

            sum = sum + nums[j];

            while(sum >= target){
                length = Math.min(length , j-i+1);
                sum = sum - nums[i];
                i++;
            }

        }

        if(length == Integer.MAX_VALUE){
            return 0;
        }
        return length;
        
    }
}