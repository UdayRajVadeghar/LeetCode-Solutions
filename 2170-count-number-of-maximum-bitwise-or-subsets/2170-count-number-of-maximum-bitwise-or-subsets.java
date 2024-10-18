class Solution {

   
    
    public int countMaxOrSubsets(int[] nums) {

        int max = 0;

        for(int i = 0 ; i < nums.length ; i++){
            max = max | nums[i];
        }

        System.out.println(max);
        int[] count = {0};

        recurse(nums , 0 , max , 0 , count);


        return count[0];


        
    }
    public static void recurse(int[] nums , int current , int max ,  int index  ,int[] count){

        if(index >= nums.length){
            if(current == max){
            count[0]++;  
            }
            return;
        }
        

        
        
        recurse(nums ,  current|nums[index] , max ,index+1 , count);
        recurse(nums , current, max , index+1 , count);
    }
}