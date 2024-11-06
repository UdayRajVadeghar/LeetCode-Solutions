class Solution {
    public boolean canSortArray(int[] nums) {

        for(int i = 0 ; i <= nums.length ; i++){

            for(int j = 0 ; j < nums.length-1 ; j++){

                int num1 = nums[j];
                int num2 = nums[j+1];
                int countBits1 = Integer.bitCount(num1);
                int countBits2 = Integer.bitCount(num2);

                if(num1 > num2 && countBits1 == countBits2){

                    nums[j] = num2;
                    nums[j+1] = num1;

                }

            }


        }

        for(int i = 0 ; i < nums.length - 1; i++){

            if(nums[i] > nums[i+1]){
                return false;
            }
            
        }
        return true;
    }
   
}