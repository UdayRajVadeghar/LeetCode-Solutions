class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> list1 = new ArrayList<>();
        recurse(nums,0,list1,list2);

        return list1;
        
    }
    public static void recurse(int[] nums , int index , List<List<Integer>> list1 , List<Integer> list2){

        list1.add(new ArrayList<>(list2));

        for(int i = index ; i < nums.length ; i++){

            if(i != index && nums[i] == nums[i-1]){
                continue;
            }
            list2.add(nums[i]);
            recurse(nums,i+1,list1,list2);
            list2.remove(list2.size()-1);
        }


    }

}