class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Map<Integer ,Integer> map1 = new HashMap<>();

        recurse(nums , 0 , list1 , list2 , map1);

        return list1;
        
        
    }
    public static void recurse(int[] nums , int index , List<List<Integer>> list1 , List<Integer> list2 , Map<Integer,Integer> map1){

        if(list2.size() == nums.length){

            list1.add(new ArrayList<>(list2));
            return;

        }

        for(int i = 0 ; i < nums.length ; i++){

            if(map1.containsKey(nums[i])){
                continue;
            }
            list2.add(nums[i]);
            map1.put(nums[i] , 1);
            recurse(nums , i+1 , list1 , list2 , map1);
            list2.removeLast();
            map1.remove(nums[i]);
        }




    }
}