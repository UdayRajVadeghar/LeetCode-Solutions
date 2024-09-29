class Solution {
    public int countOfSubstrings(String word, int k) {

        int[] arr = new int[5];
        int total = 0;
        
        
        

        for(int i = 0 ; i < word.length()-1 ;i++){
            HashMap<Character , Integer> map1 = new HashMap<>();
            int count = 0;
            int vow = 0;
            for(int j = i ; j < word.length() ;j++){

                char temp = word.charAt(j);
                
        

                if(temp == 'a'){
                    if(!map1.containsKey('a')){
                        vow++;
                        map1.put('a' , 1);
                    }
                }else if(temp == 'e'){
                    if(!map1.containsKey('e')){
                        vow++;
                        map1.put('e' , 1);
                    }
                }else if(temp == 'i'){
                    if(!map1.containsKey('i')){
                        vow++;
                        map1.put('i' , 1);
                    }
                }else if(temp == 'o'){
                    if(!map1.containsKey('o')){
                        vow++;
                        map1.put('o' , 1);
                    }
                }else if(temp == 'u'){
                    if(!map1.containsKey('u')){
                        vow++;
                        map1.put('u' , 1);
                    }
                }else{
                    count++;
                }

                if(count > k){
                    break;
                }
                if(vow == 5 && count == k){
                    total++;
                }
            }

        }

        return total;

        
        
    }
}