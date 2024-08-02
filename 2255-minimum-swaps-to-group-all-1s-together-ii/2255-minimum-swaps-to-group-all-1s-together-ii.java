class Solution {
    public int minSwaps(int[] nums) {
        
        int maxSize = 0;

        for(int i = 0 ; i < nums.length ; i++){
            
            if(nums[i] == 1){
                maxSize++;
            }

        }
        if(maxSize == 0){
            return 0;
        }
        

        int minSwaps = Integer.MAX_VALUE;
        int swaps = 0;

        int size = nums.length*2;

        int j = 0;
        int i = 0;
        while(j < size-1){
            
            if(nums[j%nums.length] == 0){
                swaps++;
            }

            if(j - i + 1 == maxSize){
                minSwaps = Math.min(swaps , minSwaps);
                while(j < size){
                    
                    if(nums[i%nums.length] == 0){
                        swaps--;
                    }
                    i++;
                    j++;
                    if(nums[j%nums.length] == 0){
                        swaps++;
                    }
                    
                    minSwaps = Math.min(swaps , minSwaps);
                    
                }

            }
            j++;
            
        }

        return minSwaps;



        
        
    }
}