class Solution {
    public int maxChunksToSorted(int[] arr) {
        

        int sum = 0;
        int chunks = 0;

        for(int i = 0 ; i < arr.length ; i++){
            
            sum = sum + arr[i];
            int expectedSum = (i*(i+1))/2;

            if(sum == expectedSum){
                chunks++;
            }

        }

        return chunks;
        
    }
}