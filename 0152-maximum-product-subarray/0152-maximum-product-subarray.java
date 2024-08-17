class Solution {
    public int maxProduct(int[] nums) {


        double prefixProduct = 1;
        double suffixProduct = 1;
        double maxProduct = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){

            prefixProduct = prefixProduct == 0? 1 : prefixProduct;
            suffixProduct = suffixProduct == 0? 1 : suffixProduct; 

            prefixProduct *= nums[i];
            suffixProduct *= nums[nums.length - 1 - i];

            maxProduct = Math.max(maxProduct , Math.max(prefixProduct , suffixProduct));

            
        }

        

        return (int)maxProduct;
        
    }
}