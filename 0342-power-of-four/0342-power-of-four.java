class Solution {
    public boolean isPowerOfFour(int n) {

        return (n & n - 1) == 0 && (n - 1) % 3 == 0;

        //since the power of 4 only occurs int the odd position in the bit representation , we can say that
        // i) n&n-1 == 0 , 
        // ii) (n-1)%3 == 0;
        //by this we can say that it is a power of four

    }
}