class Solution {
    public String addSpaces(String s, int[] spaces) {


        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        while(i < s.length()){ 

            if(j >= spaces.length){
                sb.append(s.charAt(i));
                i++;
            }else{
                if(i == spaces[j]){
                    sb.append(" ");
                    j++;
                }else{
                    sb.append(s.charAt(i));
                    i++;
                }
            }
            
        }

        return sb.toString();
        
    }
}