class Solution {
    public int lengthOfLongestSubstring(String s) {
        

        //Sliding Window Approach

        Map<Character , Integer> map1 = new HashMap<>();

        int l = 0 ;
        int r = 0 ;
        int maxLength = 0;

        while(r < s.length()){

            char temp = s.charAt(r);

            if(map1.containsKey(temp)){
                l = Math.max(map1.get(temp) + 1, l);
            }

            map1.put(temp , r);

            maxLength = Math.max(maxLength , r-l+1);
            r++;


        }

        return maxLength;




    }
}