class Solution {
    public int hammingWeight(int n) {

        int count = 0;
        int num = 1;

        while(num <= n){

            if((num & n) != 0){
                count++;
            }

            
            num = num*2;
            if(num < 0){

                break;

            }

        }

        return count;
        
        
    }
}