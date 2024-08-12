class KthLargest {
    private final int K;
    private PriorityQueue<Integer> heap;

    public KthLargest(int k, int[] nums) {
        K = k;
        heap = new PriorityQueue<>(k + 1);
        for (int num : nums) {
            heap.add(num);
            while (heap.size() > k) {
                heap.poll();
            }
        }
    }
    
    public int add(int val) {
        heap.add(val);
        if (heap.size() > K) {
            heap.poll();
        }
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */