class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = maxElement(nums);

        while(low <= high){

            int mid = low + (high-low)/2;

            int check = checkThreshold(nums,mid);

            if(check > threshold){
                low = mid + 1;
            }else{
                high = mid - 1;
            }

        }
        return low;
        
    }
    public static int maxElement(int[] nums){

        int max = 0;

        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(max , nums[i]);
        }
        return max;

    }
    public static int checkThreshold(int[] nums , int val){

        int sum = 0;

        for(int i = 0 ; i < nums.length ; i++){

            sum = sum + (int)Math.ceil((double)nums[i]/val);
            
        }

        return sum;

    }
}