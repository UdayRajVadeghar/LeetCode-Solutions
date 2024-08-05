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
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer , TreeMap<Integer , PriorityQueue<Integer>>> map1 = new TreeMap<>();
        VOT(root , 0 , 0 , map1);
        List<List<Integer>> list1 = new ArrayList<>();

        for(TreeMap<Integer , PriorityQueue<Integer>> yAxis : map1.values()){
            List<Integer> list2 = new ArrayList<>();
            for(PriorityQueue<Integer> pq : yAxis.values()){
                while(!pq.isEmpty()){
                    list2.add(pq.poll());
                }
            }
            list1.add(list2);
        }

        return list1;  
    }

    public static void VOT(TreeNode root , int x , int y , TreeMap<Integer , TreeMap<Integer , PriorityQueue<Integer>>> map1){

        if(root == null){
            return;
        }

        if(!map1.containsKey(x)){
            map1.put(x , new TreeMap<>());
        }
        if(!map1.get(x).containsKey(y)){
            map1.get(x).put(y , new PriorityQueue<>());
        }

        map1.get(x).get(y).offer(root.val);

        VOT(root.left , x - 1 , y + 1 , map1);
        VOT(root.right, x + 1 , y + 1 , map1);
    }
}