class Solution {
    public boolean containsDuplicate(int[] nums) {
      
        Map<Integer , Integer> map1 = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(!map1.containsKey(nums[i])){
                map1.put(nums[i] , 1);
            }else{
                return true;
            }
        }
        return false;
        
        
    }
}