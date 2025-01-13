class Solution {
    public int minimumLength(String s) {
        
        int length = s.length();
        HashMap<Character , Integer> map1 = new HashMap<>();
        
        for(int i = 0 ; i < length ; i++){

            char temp = s.charAt(i);

            if(!map1.containsKey(temp)){
                map1.put(temp , 1);
            }else{
                map1.put(temp , 1 + map1.get(temp));
            }

        }

        int count = 0;
        for(int i = 0 ; i < length ; i++){

            char temp = s.charAt(i);

            if(map1.get(temp) < 3 || map1.get(temp) == 0){
                continue;
            }
            if(map1.get(temp)%2 == 0 ){
                count = count+map1.get(temp)-2;
                map1.put(temp , 0);
            }else{
                count = count + map1.get(temp)-1;
                map1.put(temp , 0);
            }

        }
        length = length - count;
        return length;

    }
}