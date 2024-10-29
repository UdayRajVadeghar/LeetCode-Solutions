class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        for(int i = 0 ; i < piles.length ; i++){

            high = Math.max(high , piles[i]);

        }




        while(low <= high){

            int mid = low + (high-low) / 2;
            int expected = check(piles , mid);

            if(expected > h){
                low = mid+1;
            }else{
                high = mid - 1;
            }


        }        

        return low;
        
    }
    public static int check(int[] piles , int val){

        int hours = 0;
       

        for(int i = 0 ; i < piles.length ; i++){

            hours += Math.ceil((double)piles[i]/(double)val);


        }
        

        return hours;

    }
}