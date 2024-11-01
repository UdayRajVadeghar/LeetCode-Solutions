class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        
    
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
      
            int length = sb.length();
            if (length >= 2 && sb.charAt(length - 1) == current && sb.charAt(length - 2) == current) {
                continue;
            }
            sb.append(current);
        }
        
        return sb.toString();
    }
}
