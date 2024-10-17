class Solution {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;
        int n = nums.length - 1;
        reverseArray(nums , n - k , n);
        reverseArray(nums , 0 , n - k - 1);
        reverseArray(nums , 0 , n-1 );
        


        
    }
    public static void reverseArray(int[] arr , int i , int j ){

        while(i < j ){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;


        }

    }
}