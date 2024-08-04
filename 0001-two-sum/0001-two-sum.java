class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        int count = 0 ;
        for(int i = 0 ; i < nums.length - 1 ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                count = nums[i] + nums[j];
                if(count == target){
                
                    return new int[]{i ,j};
                }
            }
        }    
        return new int[]{-1 , -1};
    }
    
}