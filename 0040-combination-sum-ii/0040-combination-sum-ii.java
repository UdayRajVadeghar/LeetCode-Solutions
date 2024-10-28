class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        recurse(candidates,target,0,list1,list2);
        return list1;
        
    }
    public static void recurse(int[] candidates , int target ,int index , List<List<Integer>> list1 , List<Integer> list2){

        if(target == 0){
            list1.add(new ArrayList<>(list2));
        }

        for(int i = index ; i < candidates.length ; i++){

            if(index != i && candidates[i] == candidates[i-1] || target - candidates[i] < 0){
                continue;
            }
            list2.add(candidates[i]);
            recurse(candidates , target-candidates[i] , i+1 , list1 , list2);
            list2.removeLast();

        }

    }
}