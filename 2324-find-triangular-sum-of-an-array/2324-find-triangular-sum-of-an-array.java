class Solution {
    public int triangularSum(int[] nums) {

        recurse(nums , nums.length);
        return nums[0];
        
    }
    static void recurse(int[] arr ,int length){

        if(length == 1){
            return;
        }
        for(int i = 0 ; i < length-1 ; i++){

            arr[i] = (arr[i] + arr[i+1])%10;

        }

        recurse(arr , length - 1);

    }
}