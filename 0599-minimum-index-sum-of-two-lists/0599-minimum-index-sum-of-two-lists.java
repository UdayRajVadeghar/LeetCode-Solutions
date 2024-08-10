class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {


        Map<String , Integer> map1 = new HashMap<>();
        
        String[] returnString = new String[1000];

        for(int i = 0 ; i < list1.length ; i++){
            map1.put(list1[i] , i);
        } 
        int minSum = Integer.MAX_VALUE;
        
        int count = 0;

        for(int i = 0 ; i < list2.length ; i++){

            if(map1.containsKey(list2[i])){
                minSum = Math.min(minSum , map1.get(list2[i]) + i);
            }
        }

        for(int i = 0 ; i < list2.length ; i++){
            
            if(map1.containsKey(list2[i])){
                if(map1.get(list2[i]) + i == minSum){
                    returnString[count] = list2[i];
                    count++;
                }
            }
            
            
        }
        String[] returnLOL = new String[count];

        for(int i = 0 ; i < count ; i++){
            returnLOL[i] = returnString[i];
        }

        return returnLOL;
    }
}