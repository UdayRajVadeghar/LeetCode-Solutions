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
    public int maxLevelSum(TreeNode root) {

        
        
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }

        Queue<TreeNode> queue1 = new LinkedList();
        
        queue1.offer(root);

        int level = 0;
        int maxLevel = 1;
        int maxSum = root.val;
        

        while(!queue1.isEmpty()){

            int size = queue1.size();
            int sum = 0;
            level++;

            for(int i = 0 ; i < size ; i++){

                TreeNode x = queue1.poll();

                if(x.left != null){
                    queue1.offer(x.left);
                }
                if(x.right != null){
                    queue1.offer(x.right);
                }
                sum += x.val;
            }
            System.out.println(sum);
            if(sum > maxSum){
                maxSum = sum;
                maxLevel = level;
            }
            
            
        }

        return maxLevel;

        
        
    }
}