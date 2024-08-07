class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        int i = 0;

        int left = 0;
        int right = 0;


        while(right < arr.length){
            if(target[i] == arr[left]){
                i++;
                left++;
                right = left;
            }else if(target[i] == arr[right]){
                reverse(arr , left , right);
                i++;
                left++;
                right = left;

            }else{
                right++;
            }
            
        }
        

        return left > target.length-1;
        
    }
    public static void reverse(int arr[] , int left , int right){

        while(left <= right){

            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right--;
            left++;
        }
    }
}