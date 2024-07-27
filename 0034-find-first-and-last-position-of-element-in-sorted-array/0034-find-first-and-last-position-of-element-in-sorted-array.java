class Solution {
    public int[] searchRange(int[] nums, int target) {

        int [] num = new int[2];
        num[0] = firstNumber(nums,target);
        num[1] = lastNumber(nums,target);

        return num;
    }

    public int firstNumber(int[] nums, int target){
        int low =0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid] >= target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(low < nums.length && nums[low]== target){
            return low;
        }

        return -1;
    }

    public int lastNumber(int[] nums, int target){

        int low =0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid] <= target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(high >=0 && nums[high]== target){
            return high;
        }
        return -1;

    }
}