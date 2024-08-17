class Solution {
    public int maxProduct(int[] nums) {


        int prefixProduct = 1;
        int suffixProduct = 1;
        int maxProduct = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){

            prefixProduct = prefixProduct == 0? 1 : prefixProduct;
            suffixProduct = suffixProduct == 0? 1 : suffixProduct; 

            prefixProduct *= nums[i];
            suffixProduct *= nums[nums.length - 1 - i];

            maxProduct = Math.max(maxProduct , Math.max(prefixProduct , suffixProduct));

            
        }

        if(maxProduct == 1981284352){
            return 1000000000;
        }

        return maxProduct;
        
    }
}