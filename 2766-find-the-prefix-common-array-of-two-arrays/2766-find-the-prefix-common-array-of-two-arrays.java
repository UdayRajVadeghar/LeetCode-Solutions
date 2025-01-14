class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        Map<Integer , Integer> map1 = new HashMap<>();
        int[] ans = new int[A.length];

        for(int i = 0 ; i < A.length ; i++){

            
            map1.put(A[i] , i);
            

        }

        for(int i = 0 ; i < B.length ; i++){

            int get = map1.get(B[i]);

            int max = Math.max(i , get);

            ans[max]++;


        }

        for(int i = 1 ; i < B.length ; i++){
            ans[i] = ans[i] + ans[i-1];
        }

        return ans;
        
    }
}