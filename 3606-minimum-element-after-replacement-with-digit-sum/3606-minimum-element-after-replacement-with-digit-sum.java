class Solution {
    public int minElement(int[] nums) {

        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length ; i++){

            int temp = nums[i];
            int tempSum = 0;

            while(temp > 0){
                
                tempSum += temp%10;
                temp = temp/10;

            }
            min = Math.min(min , tempSum);

        }

        return min;

        
    }
}