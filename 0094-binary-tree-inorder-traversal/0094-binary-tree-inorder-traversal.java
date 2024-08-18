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
    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stack1 = new Stack<>();
        List<Integer> list1 = new ArrayList<>();
        
        while(root != null || !stack1.isEmpty()){

            while(root != null){
                stack1.push(root);
                root = root.left;
            }
            root = stack1.pop();

            list1.add(root.val);

            root = root.right;
            

        }

        return list1;
        
    }
}