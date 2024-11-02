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
    public boolean isCompleteTree(TreeNode root) {

        if(root.left == null && root.right == null){
            return true;
        }

        Queue<TreeNode> queue1 = new LinkedList<>();
        queue1.offer(root);
        boolean stop = false;
        

        while(!queue1.isEmpty()){

            int length = queue1.size();
            
            for(int i = 0 ; i < length ; i++){

                TreeNode temp = queue1.poll();
                // System.out.println(temp + " temp ");

                if(stop){

                    if(temp.left != null || temp.right != null){
                        return false;
                    }

                }else{

                    //false condition when lef tis empty and right is there
                    if(temp.left == null && temp.right != null){
                        return false;
                    }
                    //stop condition , when all should be null after that
                    if(temp.left == null && temp.right == null){

                        stop = true;

                    }
                    if(temp.left != null && temp.right == null){
                        stop = true;
                    }

                    if(temp.left != null){
                        queue1.offer(temp.left);
                    }
                    if(temp.right != null){
                        queue1.offer(temp.right);
                    }

                }
                
            }

            

        }
        return true;
    }
}