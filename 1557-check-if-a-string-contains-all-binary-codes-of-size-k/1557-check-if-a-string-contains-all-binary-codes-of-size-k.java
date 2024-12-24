class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        Set<String> set1 = new HashSet<>();

        for(int i = 0 ; i <= s.length() ; i++){

            if(i>= k){
                set1.add(s.substring(i-k , i));
            }

        }

        
        int total = (int)Math.pow(2 , k);

        if(set1.size() == total){
            return true;
        }

        return false;

    }
}