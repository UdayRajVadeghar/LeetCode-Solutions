class Solution {

    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for(int i = 0 ; i < nums.length ; i++){
            low = Math.max(low , nums[i]);
            high += nums[i];

        }
        
        while(low <= high){

            int mid = low + (high-low)/2;
            int val = check(nums,mid);

            if(val <= k ){
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return low;

        
    }
    public static int check(int[] nums , int val){

        int k = 1;
        int curSum = 0;

        for(int i = 0 ; i < nums.length ; i++){
            System.out.println("cursum : " + curSum + " value : " + val);
            if(curSum + nums[i] <= val){
                curSum += nums[i];
            }else{
                k++;
                curSum = nums[i];
            }

        }
        System.out.println(k);
        return k;

    }
}