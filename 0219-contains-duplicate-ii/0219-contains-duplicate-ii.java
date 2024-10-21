class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set1 = new HashSet<>();


        int j = 0;
        int n = nums.length;
        

        while(j <= k && j < n){
            if(set1.contains(nums[j])){
                return true;
            }else{
                set1.add(nums[j]);
            }
            j++;
        }
        int i = 0;

        while(j < n){
            set1.remove(nums[i]);
            if(set1.contains(nums[j])){
                return true;
            }
            set1.add(nums[j]);
            i++;
            j++;
        }

        return false;

        
    }
}