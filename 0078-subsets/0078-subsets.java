class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        recurse(0 ,nums , list1 , list2);

        return list1;


    }
    public static void recurse(int index , int[] nums , List<List<Integer>> list1 , List<Integer> list2){

        if(index >= nums.length){

            list1.add(new ArrayList<>(list2));
            return;

        }

        list2.add(nums[index]);
        recurse(index + 1 , nums, list1 , list2);
        list2.removeLast();
        recurse(index + 1 , nums, list1 ,list2);
    }
}