class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {

        k = s.length()/k;
        Map<String, Integer> map1 = new HashMap<>();

        for (int i = 0; i < s.length(); i += k) {

            StringBuilder sb = new StringBuilder();

            for (int j = i; j < i + k; j++) {
                sb.append(s.charAt(j));
            }
            String temp = sb.toString();

            if (!map1.containsKey(temp)) {
                map1.put(temp, 1);
            } else {
                map1.put(temp, map1.get(temp) + 1);
            }

        }

        for (int i = 0; i < t.length(); i += k) {

            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                sb.append(t.charAt(j));
            }
            String temp = sb.toString();
           
            if(map1.containsKey(temp)){
                map1.put(temp , map1.get(temp) - 1);
            }else{
                return false;
            }
            
            if(map1.get(temp) == 0){
                map1.remove(temp);
            }

        }
        
        if(map1.size() > 0){
            return false;
        }
        
        return true;


    }
}