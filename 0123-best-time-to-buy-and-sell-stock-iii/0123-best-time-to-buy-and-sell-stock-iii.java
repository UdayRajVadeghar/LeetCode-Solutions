class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        
        int n = prices.length;
        int[] left = new int[n];  // max profit with one transaction up to day i
        int[] right = new int[n]; // max profit with one transaction from day i to end
        
        // Calculate left profits
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            left[i] = Math.max(left[i-1], prices[i] - minPrice);
        }
        
        // Calculate right profits
        int maxPrice = prices[n-1];
        for (int i = n-2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            right[i] = Math.max(right[i+1], maxPrice - prices[i]);
        }
        
        // Find the maximum combined profit
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, left[i] + right[i]);
        }
        
        return maxProfit;
    }
}