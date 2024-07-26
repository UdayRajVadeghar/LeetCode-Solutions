class Solution {
    public int[] nextGreaterElements(int[] nums) {


        Stack<Integer> stack1 = new Stack<>();
        int[] arr1 = new int[nums.length ];
        int length = nums.length ;

        for(int i = 2*nums.length-1 ; i >=0 ; i--){

            while(!stack1.isEmpty() && stack1.peek() <= nums[i%length]){
                stack1.pop();
            }

            if(i < length){
                arr1[i] = stack1.isEmpty()?-1 : stack1.peek();
            }
            stack1.push(nums[i%length]);
            
        }

        return arr1;



        
    }
}