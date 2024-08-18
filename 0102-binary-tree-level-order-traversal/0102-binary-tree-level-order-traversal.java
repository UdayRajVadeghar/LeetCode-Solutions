/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list1 = new ArrayList<>();
        if(root == null){
            return list1;
        }

        Queue<TreeNode> queue1 = new LinkedList<>();
        
        queue1.offer(root);

        while(!queue1.isEmpty()){

            int size = queue1.size();
            List<Integer> list2 = new ArrayList<>();

            for(int i = 0 ; i < size ; i++){

                TreeNode temp = queue1.poll();
                list2.add(temp.val);

                if(temp.left != null){
                    queue1.offer(temp.left);
                }
                if(temp.right != null){
                    queue1.offer(temp.right);
                }
                
            }
            list1.add(list2);

        }
        return list1;



        
    }
}