class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {


        long[] arr = new long[n*(n+1)/2];
        int count = 0;

        long mod = (long)Math.pow(10 , 9) + 7;

        

        for(int i = 0 ; i < nums.length ; i++){
            long sum = 0;
            
            
            for(int j = i ; j < nums.length ; j++){

                sum = (sum + nums[j]) % mod;
                arr[count] = sum;
                count++;
            }

        
        }

        Arrays.sort(arr);

        long sum = 0;
        for(int i = left-1 ; i < right ; i++){

            
            sum += arr[i] % mod;
        }

        return (int)(sum % mod);
        
    }
}