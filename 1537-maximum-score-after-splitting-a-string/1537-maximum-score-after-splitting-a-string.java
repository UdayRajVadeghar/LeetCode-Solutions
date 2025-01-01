class Solution {
    public int maxScore(String s) {

        int ones = 0;

        for(int i= 0 ; i < s.length() ; i++){

            char temp = s.charAt(i);

            if(temp == '1'){
                ones++;
            }

        }

        int count = 0;
        int zeroes = 0;

        for(int i = 0 ; i < s.length()-1 ; i++){
            
            char temp = s.charAt(i);

            if(temp == '0'){
                zeroes++;
            }else{
                ones--;
            }
            count = Math.max(zeroes + ones , count);


        }

        return count;
        
    }
}