class Solution {
    public boolean rotateString(String s, String goal) {


        String x = s+s;

        if(goal.length() != s.length()){
            return false;
        }

        if(x.contains(goal)){
            return true;
        }
        return false;
        
    }
}