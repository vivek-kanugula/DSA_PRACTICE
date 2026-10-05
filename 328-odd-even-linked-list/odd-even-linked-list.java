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
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        ListNode ohead = head , ehead = head.next;
        ListNode ocurr = head , ecurr = head.next;
        while(ocurr.next != null && ecurr.next != null)
        {       
            ocurr.next = ecurr.next;
            ocurr = ocurr.next;
            ecurr.next = ocurr.next;
            ecurr = ecurr.next;           
        }

        ocurr.next = ehead;
        return ohead;
    }
}