/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        Queue<Integer> queue1 = new PriorityQueue<>();

        for(int i = 0 ; i < lists.length ; i++){
            ListNode current = lists[i];
            while(current != null){
                queue1.offer(current.val);
                current = current.next;
            }
        
        }

        ListNode head = new ListNode(-1);
        ListNode current = head;
        System.out.println( "Size of queue "+ queue1.size());

        
        while(!queue1.isEmpty()){
            ListNode temp = new ListNode(queue1.poll());
            current.next = temp;
            current = current.next;
            
        }

        return head.next;
        
    }
}