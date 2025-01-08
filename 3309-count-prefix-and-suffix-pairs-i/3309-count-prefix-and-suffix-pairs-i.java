class Solution {
    public int countPrefixSuffixPairs(String[] words) {


        int count = 0;

        for(int i = 0 ; i < words.length-1; i++){
            for(int j = i+1 ; j < words.length ; j++){

                if(words[j].length() < words[i].length()){
                    continue;
                }
                int pointer = 0;
                boolean flag = true;

                while(pointer < words[i].length()){
                    char temp1 = words[i].charAt(pointer);
                    char temp2 = words[j].charAt(pointer);

                    if(temp1 != temp2){
                        flag = false;
                        break;
                    }
                    pointer++;
                }

                pointer = words[i].length()-1;
                int pointer1 = words[j].length()-1;

                while(flag && pointer >= 0){
                    char temp1 = words[i].charAt(pointer);
                    char temp2 = words[j].charAt(pointer1);

                    if(temp1 != temp2){
                        flag = false;
                        break;
                    }
                    pointer--;
                    pointer1--;
                }

                if(flag){
                    count++;
                }

            }
        }

        return count;
        
    }
}