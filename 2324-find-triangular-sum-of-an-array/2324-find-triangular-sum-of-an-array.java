class Solution {
    public int triangularSum(int[] nums) {

        
        return recurse(nums , nums.length);
        
    }
    static int recurse(int[] arr ,int length){

        if(length == 1){
            return arr[0];
        }
        for(int i = 0 ; i < length-1 ; i++){

            arr[i] = (arr[i] + arr[i+1])%10;

        }

        return recurse(arr , length - 1);

    }
}