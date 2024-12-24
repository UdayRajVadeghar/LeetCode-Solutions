class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        

        if(p.length() > s.length()){
            return new ArrayList<>();
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0 ; i < p.length() ; i++){
            
            int temp1 = p.charAt(i) - 'a';
            int temp2 = s.charAt(i) - 'a';
            arr1[temp1]++;
            arr2[temp2]++;

        }
        List<Integer> list1 = new ArrayList<>();

        int k =  p.length();
        
        for(int i = k ; i <= s.length() ; i++){

            if(Arrays.equals(arr2 , arr1)){
                list1.add(i-k);
            }

            if(i < s.length()){
                int temp1 = s.charAt(i - k) - 'a';
                int temp2 = s.charAt(i) - 'a';

                arr2[temp1]--;
                arr2[temp2]++;

            }
            
            


        }

        return list1;
        
    }
}