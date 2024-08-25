/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {

        List<Integer> list1 = new ArrayList<>();

        postOrder(root , list1);

        return list1;
        
    }
    public static void postOrder(Node root , List<Integer> list1){

        if(root == null){
            return;
        }
        for(Node c : root.children){
            postOrder( c , list1);
        }
        list1.add(root.val);

    }
}