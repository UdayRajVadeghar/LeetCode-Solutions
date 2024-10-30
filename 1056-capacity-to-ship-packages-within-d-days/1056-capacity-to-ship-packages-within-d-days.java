class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high =0;

        for(int i = 0 ; i < weights.length ; i++){

            low = Math.max(low , weights[i]);
            high = high + weights[i];

        }

        while(low <= high){

            int mid = low + (high-low)/2;
            int tempDays = checkCapacity(weights , mid);

            if(tempDays <= days){
                high =  mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return low;
        
    }
    public static int checkCapacity(int[] weights , int val){

        int days = 1;
        int capacity = 0;

        for(int i = 0 ; i < weights.length ; i++){
            
            if(capacity + weights[i] <= val){
                capacity += weights[i];
            }else{
                days++;
                capacity = weights[i];
            }

        }
        return days;

    }
    
}