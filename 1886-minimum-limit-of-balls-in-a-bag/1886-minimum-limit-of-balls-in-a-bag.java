class Solution {
    public int minimumSize(int[] nums, int maxOperations) {

        int max = 0;

        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(max , nums[i]);
        }
        
        int low = 1;
        int high = max;
        int min = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high- low)/2;
            
            boolean check = checker(nums , mid , maxOperations);

            if(check){
                min = Math.min(min , mid);
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return low;

    }

    public static boolean checker(int[] nums ,int penalty, int maxOperations){

        for(int i = 0 ; i < nums.length ; i++){

            if(nums[i] > penalty){
                int operations =(int) Math.ceil((double)nums[i]/(double)penalty)-1;
                maxOperations = maxOperations - operations;
            }
            if(maxOperations < 0){
                return false;
            }

        }

        return true;

    }

}