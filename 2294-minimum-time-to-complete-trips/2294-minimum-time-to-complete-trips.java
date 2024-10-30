class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low = 1;
        long high = (long) min(time) * totalTrips;
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long trips = calculateTrips(time, mid);

            if (trips >= totalTrips) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int min(int[] time) {
        int min = Integer.MAX_VALUE;
        for (int t : time) {
            min = Math.min(min, t);
        }
        return min;
    }

    public static long calculateTrips(int[] time, long givenTime) {
        long trips = 0;
        for (int t : time) {
            trips += givenTime / t;
            if (trips >= Integer.MAX_VALUE) {
                return trips;
            }
        }
        return trips;
    }
}
