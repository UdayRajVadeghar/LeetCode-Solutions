class Solution {
    public long minimumSteps(String s) {

        long sum = 0;
        long count = 0;
        for (char ch : s.toCharArray()) {
            count += ch - '0';
            sum += ch == '0' ? count : 0;
        }
        return sum;
        
    }
}