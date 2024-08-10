class Solution{ 
    public long minimumOperations(int[] A, int[] target) {
        long total = 0;
        long operationCost = 0;
        for (int i = 0; i < A.length; ++i) {
            total += Math.max(target[i] - A[i] - operationCost, 0);
            operationCost = target[i] - A[i];
        }
        return total + Math.max(-operationCost, 0);
    }
}