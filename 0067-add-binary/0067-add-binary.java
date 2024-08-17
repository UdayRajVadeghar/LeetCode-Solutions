class Solution {
    public String addBinary(String a, String b) {

        StringBuilder sc = new StringBuilder();
        int maxIndexA = a.length() - 1;
        int maxIndexB = b.length() - 1;

        char carry = '0';

        while (maxIndexA >= 0 || maxIndexB >= 0) {
            char bit1 = maxIndexA >= 0 ? a.charAt(maxIndexA) : '0';
            char bit2 = maxIndexB >= 0 ? b.charAt(maxIndexB) : '0';

            if (bit1 == '1' && bit2 == '1') {
                if (carry == '1') {
                    sc.append('1');
                } else {
                    sc.append('0');
                    carry = '1';
                }
            } else if (bit1 == '1' || bit2 == '1') {
                if (carry == '1') {
                    sc.append('0');
                } else {
                    sc.append('1');
                }
            } else {
                if (carry == '1') {
                    sc.append('1');
                    carry = '0';
                } else {
                    sc.append('0');
                }
            }
            maxIndexA--;
            maxIndexB--;
        }

        
        if (carry == '1') {
            sc.append('1');
        }

       
        sc.reverse();

        return sc.toString();
    }
}
