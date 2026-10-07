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
    public boolean isPalindrome(ListNode head) {
        
        if(head.next == null)
            return true;
        ListNode fast = head.next , slow = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode newHead = reverse(slow.next);
        slow = head;
        ListNode curr = newHead;
        while(slow != null && curr != null)
        {
            if(slow.val != curr.val)
                return false;
            slow = slow.next;
            curr = curr.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head)
    {
        ListNode curr = head , prev = null;
        if(head.next == null)
            return head;
        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}