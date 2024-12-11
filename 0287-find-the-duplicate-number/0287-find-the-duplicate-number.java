class Solution {
    public int findDuplicate(int[] nums) {

        for(int i = 0 ; i < nums.length ; i++){

            int check  = Math.abs(nums[i]);
            if(nums[check-1] > 0){
                nums[check-1] = -1 * nums[check-1];
            }else{
                return Math.abs(nums[i]);
            }

        }

        return nums[0];
        
    }
}