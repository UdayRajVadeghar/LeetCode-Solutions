class Solution {
    public int splitArray(int[] nums, int k) {

        int low = maximumElement(nums);
        int high = maximumSum(nums);

        while(low <= high){
            int mid = (low + high)/2;

            if(isEnough(nums , k ,mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }

        }

        return low;



        

    }
    public static int maximumElement(int[] nums){
        int max = 0;

        for(int i = 0 ; i < nums.length ; i++){
            max = Math.max(max , nums[i]);
        }

        return max;
    }
    public static int maximumSum(int[] nums){
        int sum =0;

        for(int i = 0 ; i < nums.length ; i++){
            sum = sum + nums[i];
        }

        return sum;
    }
    public static boolean isEnough(int[] nums , int k , int mid){
        int sum = 0;
        int count = 1;
        //System.out.println("Mid is : " + mid);

        for(int i = 0 ; i < nums.length ; i++){

            if(sum + nums[i] > mid){
                count++;
                sum = nums[i];
            }else{
                sum = sum + nums[i];
            }
        }
        if(count <= k){
            //System.out.println("Count is : " + count);
            return true;
        }
        return false;
    }
}