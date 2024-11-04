class Solution {
    public String compressedString(String word) {

        StringBuilder sb = new StringBuilder();
        char prev = word.charAt(0);
        int count = 0;

        for(int i = 0 ; i <  word.length() ; i++){

            char temp = word.charAt(i);

            if(temp == prev && count != 9){
                count++;       
            }else{
                
                sb.append(count);
                sb.append(prev);
                count = 1;
            
            }
            if(i == word.length()-1){
                sb.append(count);
                sb.append(temp);
            }
            prev = temp;

        }

        return sb.toString();

        
        
    }
}