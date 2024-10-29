class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maximum = max(piles);
        System.out.println(maximum);
        
        int low = 1;
        int high = maximum;

        while (low <= high) {
            int mid = low + (high-low) / 2;
            int temp = hours(piles, mid);

            if (temp <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int max(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        return max;
    }

    public static int hours(int[] piles, int num) {
        int hours = 0;
        for (int i = 0; i < piles.length; i++) {

            hours += Math.ceil((double)piles[i]/(double)num);

        }
        System.out.println(hours);
        return hours;
    }
}