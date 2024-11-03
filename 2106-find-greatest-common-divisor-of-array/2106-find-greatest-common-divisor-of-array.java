class Solution {
    public int findGCD(int[] nums) {


        int largest = 0;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length ; i++){

            largest = Math.max(largest , nums[i]);
            smallest = Math.min(smallest , nums[i]);

        }
        int gcd = 0;

        for(int i = 1 ; i <= smallest ; i++){

            if(smallest%i == 0 && largest%i == 0){
                gcd = i;
            }

        }

        return gcd;
        
    }
}