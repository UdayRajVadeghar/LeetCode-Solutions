class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {


        int index = 0;
        HashSet<List<Integer>> hashSet = new HashSet<>();
        Arrays.sort(candidates);
        combinationSum(candidates , index , target , new ArrayList<>() , hashSet);
        List<List<Integer>> listans = new ArrayList<>(hashSet);
        return listans;

       
       
          
    }
    public static HashSet<List<Integer>> combinationSum(int[] candidates , int index , int target , List<Integer> list1 , HashSet<List<Integer>> hashSet){

        if(index == candidates.length){
            if(target == 0){
                Collections.sort(list1);
                hashSet.add(new ArrayList<>(list1));
            }
            return hashSet;
        }
        if(candidates[index] <= target){
            list1.add(candidates[index]);
            combinationSum(candidates , index + 1,target - candidates[index], list1 , hashSet );
            list1.remove(list1.size() - 1);
            while (index + 1 < candidates.length && candidates[index] == candidates[index + 1]) {
                index++;
            }    
        }
        combinationSum(candidates , index + 1 , target , list1 , hashSet);
        return hashSet;
    }
}