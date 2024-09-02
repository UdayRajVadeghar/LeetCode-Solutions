class Solution {
    public int chalkReplacer(int[] chalk, int k) {

        int sum = 0;

        for(int i = 0 ; i < chalk.length ; i++){

            sum = sum + chalk[i];

            if(sum > k){
                return i;
            }

        }

        int remaining = k%sum;
        sum = 0;
        int count = 0;

        for(int i = 0 ; i < chalk.length ;i++){

            sum = sum + chalk[i];

            if(sum > remaining){
                
                count = i;
                break;
                
            }

        }
        return count;
        


    }
}