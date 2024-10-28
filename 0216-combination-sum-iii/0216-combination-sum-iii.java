class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {


        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        recurse(k,n,1,list1,list2);

        return list1;

        
    }
    public static void recurse(int size , int target , int index , List<List<Integer>> list1 , List<Integer> list2 ){
        
        if(target < 0){
            return;
        }

        if(size == 0){

            if(target == 0){
                list1.add(new ArrayList<>(list2));
            }
            return;
        }

        for(int i = index ; i <= 9 ; i++){
            list2.add(i);
            recurse(size-1,target-i,i+1,list1,list2);
            list2.removeLast();
        }

    }
}