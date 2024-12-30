class Solution {
    public int longestSemiRepetitiveSubstring(String s) {

        if(s.length() == 1){
            return 1;
        }
        int count = 0;
        int maxLength = 0;
        boolean flag = false;

        int i = 0;
        int j = 1;
        
        while(j < s.length() && i < s.length()){

            char temp1 = s.charAt(j);
            char temp2 = s.charAt(j-1);

            if(flag && temp1 == temp2){
                while(i < j){
                    char tempx = s.charAt(i);
                    char tempy = s.charAt(i+1);

                    if(tempx == tempy){
                        i++;
                        break;
                    }
                    i++;
                }
            }else if(temp1 == temp2){

                flag = true;

            }
            
            if(flag){
                maxLength = Math.max(maxLength , j-i + 1);
            }
            
            j++;           

        }

        if(!flag){
            return s.length();
        }

        return maxLength;

        
    }
}