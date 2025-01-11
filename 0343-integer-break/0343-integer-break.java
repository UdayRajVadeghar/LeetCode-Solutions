class Solution {
    public int integerBreak(int n) {
        if(n==2) return 1;
        if(n==3) return 2;
        return recurse(n , 1);
    }
    public static int recurse(int n , int product ){
        
        if(n < -1){
            return 0;
        }

        if(n == 0){
            return product;
        }
        
        int max = Math.max(recurse(n-3 , product*3) , recurse(n-2 , product * 2));
    

        return max;
    }
}