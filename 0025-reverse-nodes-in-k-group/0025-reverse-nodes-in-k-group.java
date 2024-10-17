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
    public ListNode reverseKGroup(ListNode head, int k) {

        Stack<Integer> stack1 = new Stack<>();
        
        ListNode current = head;
        ListNode newHead = new ListNode(-1);
        ListNode current1 = newHead;
        int length = 0;

        while(current != null){
            current = current.next;
            length++;
        }

        System.out.println(length);
        current = head;

        while(current != null && current.next != null){

            int times = k;
            
            if(length < k){
                break;
            }

            while(times > 0){
                stack1.push(current.val);
                current = current.next;
                length--;
                times--;
            }
            while(!stack1.isEmpty()){
                
                current1.next = new ListNode(stack1.pop());
                current1 = current1.next;

            }

        }
        if(current != null){
            current1.next = current;
        }

        return newHead.next;
        
    }
}