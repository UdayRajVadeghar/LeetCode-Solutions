class Solution {
    public boolean canJump(int[] nums) {

        int nextIndex = 0;

    

        for(int i = 0 ; i < nums.length ; i++){

            nextIndex = Math.max(nextIndex , i + nums[i]);

            if(nextIndex == i && i != nums.length - 1){
                return false;
            }


        }


        return true;
        
    }
}