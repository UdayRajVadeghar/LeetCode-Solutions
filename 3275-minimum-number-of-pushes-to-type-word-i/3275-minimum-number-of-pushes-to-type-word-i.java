class Solution {
    public int minimumPushes(String word) {

        int count = 1;
        int check = 8;
        int sum = 0;
        for(int i = 0 ; i < word.length() ; i++){

            if(check == 0){
                count++;
                check = 8;
            }

            sum += count;
            check--;

        }

        return sum;
        
    }
}