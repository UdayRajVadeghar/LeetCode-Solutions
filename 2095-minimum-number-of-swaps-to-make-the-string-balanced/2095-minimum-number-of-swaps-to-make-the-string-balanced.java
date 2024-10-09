class Solution {
    public int minSwaps(String s) {
        int n = s.length();
        int st_size = 0;
        int mimatched = 0;

        for(int i=0; i<n ; i++){
            char c = s.charAt(i);
            if(c == '['){
                st_size++;
            }else{
                if(st_size>0){
                    st_size--;
                }else{
                    mimatched++;
                }
            }
        }
        return (mimatched + 1)/2;
    }
}