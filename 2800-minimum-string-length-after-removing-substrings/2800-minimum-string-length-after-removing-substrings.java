
class Solution {
    public int minLength(String s) {




        while(true){
            int initial = s.length();
            String k = s.replaceAll("AB" ,"");
            if(!(k.length() == s.length())){
                s = s.replace("AB" , "");
            }
            String x = s.replaceAll("CD" , "");
            if(!(x.length() == s.length())){
                s = s.replace("CD" ,"");
            }

            if(s.length() == initial){
                break;
            }

        }

        return s.length();


    }
}