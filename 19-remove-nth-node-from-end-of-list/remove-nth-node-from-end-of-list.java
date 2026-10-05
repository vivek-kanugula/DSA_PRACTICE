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
        
        if(head == null || head.next == null)
            return null;
        ListNode prev = head , curr = head;
        while(curr != null && n>=1)
        {
            curr = curr.next;
            n--;
        }

        if(curr == null)
            return head.next;
        while(curr != null && curr.next != null)
        {
            curr = curr.next;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}