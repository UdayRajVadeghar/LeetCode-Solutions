class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {

        int xor = (int)Math.pow(2,maximumBit) - 1;
        int contXor = 0;
        int[] arr = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){

            contXor = contXor^nums[i];
            int mask = contXor ^ xor;
            arr[i] = mask; 

        }
        reverseArr(arr);

        return arr;

        
        
    }
    public static void reverseArr(int[] arr){

        int i = 0;
        int j = arr.length - 1;

        while( i < j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

    }
}