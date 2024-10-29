class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
    

        recurse(nums , 0 , list1);

        return list1;
        
        
    }
    public static void recurse(int[] nums , int index , List<List<Integer>> list1){

        if(index == nums.length){
            List<Integer> list2 = new ArrayList<>();
            for(int i = 0 ; i < nums.length ; i++){

                list2.add(nums[i]);

            }

            list1.add(new ArrayList<>(list2));
            return;

        }
        
        for(int i = index ; i < nums.length ; i++){

            swap(nums , index , i);
            recurse(nums,index+1,list1);
            swap(nums , index , i);

        }





    }
    public static void swap(int[] nums , int i , int j){

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}