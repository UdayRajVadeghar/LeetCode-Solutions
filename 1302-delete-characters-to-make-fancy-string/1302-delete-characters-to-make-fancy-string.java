class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int sameCount = 0;
        char prev = s.charAt(0);
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if(ch == prev) {
                sameCount++;
            } else {
                sameCount = 1;
            }
            if(sameCount < 3) {
                sb.append(s.charAt(i));
            }
            prev = ch;
        }
        return sb.toString();
    }
}