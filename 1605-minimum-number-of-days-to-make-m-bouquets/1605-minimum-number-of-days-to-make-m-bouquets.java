class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

     
        int min = 1;
        int length  = bloomDay.length;
        int ans = Integer.MAX_VALUE;
        int low = min(bloomDay);
        int high = max(bloomDay);

        if(m*k > length){
            return -1;
        }

        while(low <= high){

            int mid = low + (high-low)/2;
            //System.out.println(mid);
            if(binarySearch(bloomDay , m , k , mid)){
                // System.out.println("hI");
                ans = Math.min(ans , mid);
                high = mid - 1;
            }else{
                low = mid + 1;
            }


        }
        if(ans == Integer.MAX_VALUE){
            return -1;
        }

        return ans;
        
    }
    public boolean binarySearch(int[] bloomDay , int m , int k , int days){

        int count = 0;
        int flowers = 0;
        for(int i = 0 ; i < bloomDay.length ; i++){

            if(bloomDay[i] <= days){
                flowers++;
            }else{
                flowers = 0;
            }

            if(flowers == k){
                flowers = 0;
                count++;
            }

        }

        if(count >= m){
            return true;
        }

        return false;

    }
    public static int max(int[] bloomDay){

        int max = 0;
       


        for(int i = 0 ; i < bloomDay.length ; i++){
            max = Math.max(max , bloomDay[i]);
         
        }

        return max;

    }
    public static int min(int[] bloomDay){

        
        int min = Integer.MAX_VALUE;


        for(int i = 0 ; i < bloomDay.length ; i++){
         
            min = Math.min(min , bloomDay[i]);
        }

        return min;

    }

}