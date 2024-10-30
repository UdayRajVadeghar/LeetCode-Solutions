class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {

        List<Integer> list2 = new ArrayList<>();
        HashSet<List<Integer>> list1 = new HashSet<>();
        
        recurse(nums , 0 , list2 , list1);
        List<List<Integer>> list = new ArrayList<>(list1);
        return list;


        
    }
    public static void recurse(int[] nums , int index , List<Integer> list2 , HashSet<List<Integer>> list1){

        if(index >= nums.length){
            if(list2.size() >= 2){
                list1.add(new ArrayList<>(list2));
            }
            return;
        }

        if(list2.size()==0 || list2.get(list2.size()-1) <= nums[index]){

            list2.add(nums[index]);
            recurse(nums,index+1,list2,list1);
            list2.remove(list2.size()-1);

        }


        recurse(nums,index+1,list2,list1);


        
        
    }
}