class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) { 
        
        int index = 0 ;
        HashSet<List<Integer>> finalList = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        allSubsets(nums , index , list1 , finalList);
        HashSet<List<Integer>> correctAns = new HashSet<>();
        for(List<Integer> element : finalList){
            Collections.sort(element);
            correctAns.add(element);
        }
        List<List<Integer>> ans = new ArrayList<>(correctAns);

        return ans;

    }

    public static HashSet<List<Integer>> allSubsets(int[] nums , int index , List<Integer> list1 , HashSet<List<Integer>> finalList){

        if(index == nums.length){
        
            finalList.add(new ArrayList<>(list1));
            return finalList;
        }

        list1.add(nums[index]);
        allSubsets(nums , index + 1 , list1 , finalList);
        list1.remove(list1.size() - 1);
        allSubsets(nums , index +  1 , list1 , finalList);
        return finalList;

    }
}