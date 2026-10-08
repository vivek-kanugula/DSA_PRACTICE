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
        
        ListNode temp = head , prevnode = null , nextnode = null , kthnode = null , newhead = null;
        while(temp != null)
        {
            kthnode = kthnode(temp,k);
            if(kthnode == null)
            {
                if(prevnode != null)
                {
                    prevnode.next = temp;
                }
                break;
            }

            nextnode = kthnode.next;
            kthnode.next = null;
            newhead = reverse(temp);
            if(temp == head)
                head = kthnode;
            else
                prevnode.next = kthnode;
            prevnode = temp;
            temp = nextnode;
        }
        return head;
    }

    public ListNode kthnode(ListNode head , int k)
    {
        ListNode temp = head;
        while(temp != null && k>1)
        {
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public ListNode reverse(ListNode head)
    {
        ListNode curr = head , prev = null , next = null;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}