class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int i = 0;
        

        List<List<Integer>> list1 = new ArrayList<>();
        
        Arrays.sort(nums);

        while(i <= nums.length ){
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                if(nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> list2 = new ArrayList<>();
                    list2.add(nums[i]);
                    list2.add(nums[j]);
                    list2.add(nums[k]);
                    
                    list1.add(list2);
                    System.out.println(i + " " + j + " " + k);
                    int temp1 = nums[j];
                    int temp2 = nums[k];
                    while(j < nums.length && nums[j] == temp1 ){
                        j++;
                    }
                    while(nums[k] == temp2 && k > 0){
                        k--;
                    }
                }
                else if(nums[i] + nums[j] + nums[k] < 0){
                    j++;
                }else{
                    k--;
                }

            }
            if( i <= nums.length-1){

                int temp = nums[i];

                while(i < nums.length && nums[i] == temp){
                    i++;
                }

            }else{
                break;
            }
            
            
        }

        return list1;
        
    }
}