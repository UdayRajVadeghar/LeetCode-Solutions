class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

        String arr[] = sentence.split(" ");

        for(int i = 0 ; i < arr.length ; i++){

            int j = 0;
            int k = 0;
            String s = arr[i];

            if(s.length() < searchWord.length()){
                continue;
            }

            String sub = s.substring(0 , searchWord.length());

            System.out.println(sub);

            if(sub.equals(searchWord)){
                return i+1;
            }
            

        }

        return -1;
        
    }
}