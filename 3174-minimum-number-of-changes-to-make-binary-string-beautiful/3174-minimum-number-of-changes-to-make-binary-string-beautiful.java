class Solution {
    public int minChanges(String s) {

        int i =0;
        int j = 1;
        int count = 0;

        while(j < s.length()){

            char temp1 = s.charAt(i);
            char temp2 = s.charAt(j);

            if(temp1 != temp2){
                count++;
            }
            i = i + 2;
            j = j + 2;
        }
        return count;

        
    }
}