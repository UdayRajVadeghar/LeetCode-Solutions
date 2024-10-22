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
    public long kthLargestLevelSum(TreeNode root, int k) {

        Queue<TreeNode> queue1 = new LinkedList<>();
        PriorityQueue<Long> priQue = new PriorityQueue<>();

        if(root == null){
            return -1;
        }
            
        queue1.offer(root);
        while(!queue1.isEmpty()){

            long sum = 0;
            int size = queue1.size();

            for(int i = 0 ; i < size ; i++){

                long tempVal = queue1.peek().val;
                TreeNode temp = queue1.poll();
                sum = sum + tempVal;

                if(temp.left != null){
                    queue1.offer(temp.left);
                }
                if(temp.right != null){
                    queue1.offer(temp.right);
                }

            }
            priQue.offer(sum);
            if(priQue.size() > k){
                priQue.poll();
            }

        }
        

        if(k > priQue.size()){
            return -1;
        }

        return priQue.poll();

        
    }
}