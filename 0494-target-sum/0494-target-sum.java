class Solution {
    public int findTargetSumWays(int[] nums, int target) {
    
        // Integer dp[][] = new Integer[nums.length+1][]

       return recurse(nums , target , nums.length-1);

        
    }
    public static int recurse(int[] arr , int target  , int index ){

        if(index == -1){
            if(target == 0){
                return 1;
            }
            return 0;
        }

        int count1 = recurse(arr , target-arr[index] , index-1);
        int count2 = recurse(arr , target+arr[index] , index-1);

        return count1 + count2;


    }
}