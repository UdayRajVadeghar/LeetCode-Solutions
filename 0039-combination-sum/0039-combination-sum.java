class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> list1 = new ArrayList<>();

        recurse(candidates , target , 0 , list1 , list2);

        return list1;


        
    }
    public static void recurse(int[] candidates , int target , int index , List<List<Integer>> list1 , List<Integer> list2){

        if(target < 0){
            return;
        }

        if(index >= candidates.length){
            
            if(target == 0){
                list1.add(new ArrayList<>(list2));
            }
            return;

            
        }

        list2.add(candidates[index]);
        recurse(candidates , target - candidates[index] , index , list1 , list2);
        list2.removeLast();
        recurse(candidates, target , index+1 , list1 , list2);

    }
}