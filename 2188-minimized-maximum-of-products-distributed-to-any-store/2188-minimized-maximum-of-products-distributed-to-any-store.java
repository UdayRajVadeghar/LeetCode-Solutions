class Solution {
    public int minimizedMaximum(int n, int[] quantities) {

        int low = 1;
        int high = sum(quantities);

        while(low <= high){
            
            int mid = low + (high-low)/2;
            int required = check(quantities , mid);

            if(required <= n){
                high = mid - 1;
            }else{
                low = mid + 1;
            }

        }
        return low;
        
    }
    public static int check(int[] quantities , int val){

        int wareHouses = 0;
       

        for(int i = 0 ; i < quantities.length ; i++){

            wareHouses = wareHouses + (int)Math.ceil((double)quantities[i]/val);

        }

        return wareHouses;

    }
    public static int sum(int[] quantities){

        int sum = 0;

        for(int i = 0 ; i < quantities.length ; i++){

            sum = Math.max(sum , quantities[i]);

        }

        return sum;

    }
}