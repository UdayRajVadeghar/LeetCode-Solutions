import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int target1 = 0;
        Map<Integer , Integer> map1 = new HashMap<>();
        int[] arr1 = new int[2];

        for(int i = 0 ; i < nums.length ; i++){
            target1 = target - nums[i];

            if(map1.containsKey(target1)){
                arr1[0] = map1.get(target1);
                arr1[1] = i;
            }else{
                map1.put(nums[i] , i);
            }
        }
        return arr1;

    }

}