

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        List<List<Integer>> list1 = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            list1.add(new ArrayList<>());
        }
        int max= 0;
        Map<Integer , Integer> map1 = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(!map1.containsKey(nums[i])){
                map1.put(nums[i] , 1);
            }else{
                int temp = map1.get(nums[i]) + 1;
                map1.put(nums[i] , temp);
            }
            max = Math.max(map1.get(nums[i]) , max);
        }

        for(Integer key : map1.keySet()){

            int freq = map1.get(key);

            list1.get(freq).add(key);

        }

        int[] arr = new int[k];
        int count = 0;

        for(int i = max ; i >=0 ; i--){

            if(list1.get(i).size() != 0){

                for(int j = 0 ; j < list1.get(i).size() ; j++){

                    arr[count] = list1.get(i).get(j);
                    count++;

                }

            }
            if(count == k){
                break;
            }

        }

        return arr;



        
        
    }
}