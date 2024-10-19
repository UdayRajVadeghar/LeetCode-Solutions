class Solution {
    public int maxArea(int[] arr) {

        int i = 0;
        int j = arr.length-1;
        int max = 0;

        while(i < j){
            int distance = (j-i);
            int height = Math.min(arr[i] , arr[j]);
            max = Math.max(max , distance*height);

            if(arr[i] <= arr[j]){
                i++;
            }else{
                j--;
            }

        }

        return max;
        

    }
}