class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> list1 = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){

            int element = Math.abs(nums[i]);

            if(nums[element-1] < 0){
                list1.add(element);
            }else{
                nums[element-1] = nums[element-1]*(-1);
            }

        }
        return list1;
        
    }
}