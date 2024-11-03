class Solution {
    public boolean isBalanced(String num) {

        int odd = 0;
        int even = 0;
        for(int i = 0 ; i < num.length() ; i++){

            int temp = num.charAt(i) - '0';

            if(i%2 == 0){
                even += temp;
            }else{
                odd+= temp;
            }

        }

        if(odd == even){
            return true;
        }
        return false;
        
    }
}