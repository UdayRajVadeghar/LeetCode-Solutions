class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {

        if(queries.length == 0 || arr.length == 0){
            return arr;
        }

        int[] arr1 = new int[queries.length];

        for(int i = 0 ; i < queries.length ;i++){

            int low = queries[i][0];
            int high = queries[i][1];
            int temp = 0;
            for(int j = low ; j <= high ;j++){
                temp = temp^arr[j];
            }
            arr1[i] = temp;


        }

        return arr1;
        
    }
}