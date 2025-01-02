class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {

        int[] prefixSum = new int[words.length];

        for(int i = 0 ; i < words.length ; i++){

            int count = 0;
            char temp1 = words[i].charAt(0);
            char temp2 = words[i].charAt(words[i].length()-1);

            if((temp1 == 'a' || temp1 == 'e' || temp1 == 'i' || temp1 == 'o' || temp1 == 'u') && (temp2 == 'a' || temp2 == 'e' || temp2 == 'i' || temp2 == 'o' || temp2 == 'u')  ){
                count++;
            }

            if(i == 0){
                prefixSum[i] = count;
            }else{
                prefixSum[i] = prefixSum[i-1] + count;
            }

        }

        int[] ans = new int[queries.length];

        for(int i = 0 ; i < queries.length ; i++){

            int start = queries[i][0];
            int end = queries[i][1];
            

            if(start == 0){
                ans[i]=prefixSum[end];
            }else if(end == start){
                ans[i] = prefixSum[end] - prefixSum[end-1];
            }else{
                ans[i] = prefixSum[end] - prefixSum[start];
            }
        }

        return ans;
        
    }
}