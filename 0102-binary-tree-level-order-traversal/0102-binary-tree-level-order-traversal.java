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
    public List<List<Integer>> levelOrder(TreeNode root) {

        // //Using Iterative way
        // List<List<Integer>> list1 = new ArrayList<>();
        // if(root == null){
        //     return list1;
        // }

        // Queue<TreeNode> queue1 = new LinkedList();
        
        // queue1.offer(root);

        

        // while(!queue1.isEmpty()){

        //     int size = queue1.size();
        //     List<Integer> temp = new ArrayList<>();

        //     for(int i = 0 ; i < size ; i++){

        //         TreeNode x = queue1.poll();

        //         if(x.left != null){
        //             queue1.offer(x.left);
        //         }
        //         if(x.right != null){
        //             queue1.offer(x.right);
        //         }
        //         temp.add(x.val);
        //     }
        //     list1.add(new ArrayList<>(temp));
            
        // }

        // return list1;

        //Recursive

        List<List<Integer>> list1 = new ArrayList<>();
        levelOrder(root , list1 , 1);
        return list1;



    }

    public static void levelOrder(TreeNode root , List<List<Integer>> list1 , int level){

        if(root == null){
            return;
        }
        if(level > list1.size()){
            list1.add(new ArrayList<>());
        }
        list1.get(level-1).add(root.val);
        levelOrder(root.left , list1 , level+1);
        levelOrder(root.right , list1 , level+1);
    }
}