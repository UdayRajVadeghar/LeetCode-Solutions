class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        int[] count = {0};
        recurse(nums , target  , 0 , 0 , count);

        return count[0];
        

        
    }
    public static void recurse(int[] arr , int target , int curSum , int index ,int[] count){

        if(index >= arr.length){
            if(curSum == target){
                count[0]++;
            }
            return;
        }

        recurse(arr , target , curSum + arr[index] , index + 1 , count);//pick
        recurse(arr, target , curSum - arr[index] , index+1 , count);//pick but substract

    }
}