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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null || head.next == null){
            return null;
        }

        ListNode current = head;

        for(int i = 0 ; i < n ; i++){

        
            current = current.next;

        }

        ListNode prev = null;
        ListNode remove = head;

        while(current != null){

            current = current.next;
            prev = remove;
            remove = remove.next;
        }

        if(prev == null){
            return head.next;
        }
        
        prev.next = remove.next;

        return head;
        
    }
}