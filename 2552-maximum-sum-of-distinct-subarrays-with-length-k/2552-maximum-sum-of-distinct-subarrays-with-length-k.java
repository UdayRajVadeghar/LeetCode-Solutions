class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long sum = 0;
        TreeMap<Integer , Integer> map1 = new TreeMap<>();

        for(int i = 0 ; i < k ; i++){

            sum = sum + nums[i];

            if(!map1.containsKey(nums[i])){
                map1.put(nums[i] , 1);
            }else{
                map1.put(nums[i] , map1.get(nums[i]) + 1);
            }

        }

        long ans = 0;

        if(map1.size() == k){
            ans = sum;
        }

        for(int i = k ; i < nums.length ; i++){

            int prev = nums[i - k];

            map1.put(prev , map1.get(prev) - 1);

            if(map1.get(prev) == 0){
                map1.remove(prev);
            }
            sum = sum - prev;

            if(!map1.containsKey(nums[i])){
                map1.put(nums[i] , 1);
            }else{
                map1.put(nums[i] , map1.get(nums[i]) + 1);
            }
            sum = sum + nums[i];

            if(map1.size() == k){
                ans = Math.max(ans , sum);
            }

        }

        return ans;

        
    }
}