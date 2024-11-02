class Solution {
    public String frequencySort(String s) {

        List<List<Character>> list1 = new ArrayList<>();

        for(int i = 0 ; i <= s.length() ; i++){

            list1.add(new ArrayList<>());

        }

        Map<Character , Integer> map1 = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){

            char temp = s.charAt(i);

            if(!map1.containsKey(temp)){

                map1.put(temp , 1);

            }else{

                int freq = map1.get(temp) + 1;
                map1.put(temp , freq);

            }

        }

        for(Character key : map1.keySet()){

            int freq = map1.get(key);
            list1.get(freq).add(key);

        }

        StringBuilder sb = new StringBuilder();

        int size = list1.size() - 1;

        for(int i = size ; i >= 0 ; i--){
            
            if(list1.get(i).size() != 0){
                
                //iterate through all the characters 
                int length = list1.get(i).size();

                for(Character temp : list1.get(i)) {
                    for(int k = 0; k < i; k++) {
                        sb.append(temp);
                    }
                }


            }
            

        }

        return sb.toString();
        
        
        
    }
}