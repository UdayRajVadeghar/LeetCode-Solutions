class Solution {
    public int partitionString(String s) {
        
        int count = 1;

        HashSet<Character> map1 = new HashSet<>();

        for(int i = 0 ; i < s.length() ; i++){

            if(map1.contains(s.charAt(i))){
                map1.clear();
                count++;
            }

            

            map1.add(s.charAt(i));

        }

        return count;


    }
}