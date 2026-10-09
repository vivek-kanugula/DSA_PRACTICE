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
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        ListNode mid = find(head);
        ListNode lefthead = head , righthead = mid.next;
        mid.next = null;
        lefthead = sortList(lefthead);
        righthead = sortList(righthead);
        return merge(lefthead,righthead);
    }

    public ListNode merge(ListNode left , ListNode right)
    {
        ListNode a = left , b = right;
        ListNode dum = new ListNode(-1);
        ListNode curr = dum;
        while(a != null && b != null)
        {
            if(a.val <= b.val)
            {
                curr.next = a;
                a = a.next;
            }
            else
            {
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }

        if(a == null)
            curr.next = b;
        else if(b == null)
            curr.next = a;
        return dum.next;
    }

    public ListNode find(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        ListNode slow = head , fast = head.next;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}