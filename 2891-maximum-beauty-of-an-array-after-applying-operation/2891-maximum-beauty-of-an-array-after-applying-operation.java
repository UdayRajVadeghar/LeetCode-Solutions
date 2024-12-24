class Solution {
    public int maximumBeauty(int[] nums, int k) {

        
       
        Arrays.sort(nums);
        
        int i = 0;
        int j = 0;
        int max = 0;

        while(j < nums.length){

            if(nums[j] - nums[i] <= 2*k){
                max = Math.max(j-i+1 , max);
                j++;
            }else{
                i++;
            }

        }

        return max;


    }
}