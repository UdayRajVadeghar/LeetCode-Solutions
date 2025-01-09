class Solution {
    public int prefixCount(String[] words, String pref) {

        int count = 0;

        for(int i = 0 ; i < words.length ; i++){

            if(words[i].length() < pref.length()){
                continue;
            }

            int ptr = 0;
            boolean flag = true;

            while(ptr < pref.length()){
                char temp1 = words[i].charAt(ptr);
                char temp2 = pref.charAt(ptr);

                if(temp1 != temp2){
                    flag = false;
                    break;
                }
                ptr++;
            }
            if(flag){
                count++;
            }


        }

        return count;
        
    }
}