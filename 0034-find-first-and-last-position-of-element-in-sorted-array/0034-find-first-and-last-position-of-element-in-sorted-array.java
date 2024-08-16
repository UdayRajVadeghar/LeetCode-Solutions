class Solution {
    public int[] searchRange(int[] nums, int target) {

        int low = 0 ;
        int high = nums.length - 1;
        int index1 = -1;
        int index2 = -1;

        while(low <= high){

            int mid = (low + high)/2;

            if(nums[mid] >= target){
                if(nums[mid] == target){
                    index1 = mid;
                }
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }

        low = 0;
        high = nums.length - 1;

        while(low <= high){

            int mid = (low + high)/2;

            if(nums[mid] <= target){
                if(nums[mid] == target){
                    index2 = mid; 
                
                }
                low = mid + 1;
            }else{
                high = mid - 1;
            }

        }

        int[] arr = {index1 , index2};

        return arr;
        
    }
}