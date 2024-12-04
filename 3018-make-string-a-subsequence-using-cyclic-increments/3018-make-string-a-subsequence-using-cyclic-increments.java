
import java.util.*;


public class Main{

    public static void main(String[] args) {

        Solution sol = new Solution();

        String str1 = "abc";
        String str2 = "ad";

        System.out.println(sol.canMakeSubsequence(str1 , str2));


    }

}
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {

        if(str1.length() < str2.length()){
            return false;
        }

        int i = 0;
        int j = 0;

        while( j < str2.length() && i < str1.length()){

            char temp1 = str1.charAt(i);
            char temp2 = str2.charAt(j);
            char temp3;
            if(temp1 == 'z'){
                temp3 = 'a';
            }else{
                temp3 = (char)((int)temp1 + 1);
            }

        
            if(temp2 == temp1 || temp3 == temp2){

                i++;
                j++;
            }else{
                i++;
            }


        }

        if(j < str2.length()){
            return false;
        }

        return true;



    }
}