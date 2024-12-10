class Solution {

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static long lcm(int a, int b) {
        return Math.abs((long) a * b) / gcd(a, b);
    }

    public int nthMagicalNumber(int n, int a, int b) {
        long MOD = (long) (Math.pow(10, 9) + 7);
        long low = Math.min(a, b);
        long high = (long) n * Math.min(a, b); 
        long lcm = lcm(a, b);

        while (low < high) {
            long mid = low + (high - low) / 2;
            long value = helper(a, b, lcm, mid);

            if (value < n) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return (int) (low % MOD);
    }

    public static long helper(int a, int b, long lcm, long num) {
        return num / a + num / b - num / lcm;
    }
}
