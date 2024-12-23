/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minimumOperations(TreeNode root) {
        int count = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            int[] arr1 = new int[size];
            int[] arr2 = new int[size];
            for(int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                arr1[i] = temp.val;
                arr2[i] = temp.val;
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            count += fun(arr1, arr2);
        }
        return count;
    }

    static int fun(int[] arr1, int[] arr2) {
        int n = arr1.length;
        if(n == 1) return 0;
        Arrays.sort(arr1);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) map.put(arr1[i], i);
        
        int count = 0;
        for(int i = 0; i < n; ) {
            int index = map.get(arr2[i]);
            if(index == i) i++;
            else {
                count++;
                int temp = arr2[i];
                arr2[i] = arr2[index];
                arr2[index] = temp;
            }
        }
        return count;
    }
}