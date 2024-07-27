class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> queue1 = new PriorityQueue<>();

        for(int i = 0 ; i < nums.length ; i++){
            queue1.offer(nums[i]);
            if(queue1.size() > k){
                queue1.poll();
            }
        
        }

        return queue1.poll();
        
    }
}