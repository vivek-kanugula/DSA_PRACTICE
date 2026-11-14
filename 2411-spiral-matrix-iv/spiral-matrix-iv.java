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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] a = new int[m][n];
        for(int[] row : a)
            Arrays.fill(row , -1);
        if(head == null)
            return a;
        ListNode curr = head;
        int top = 0 , left = 0 , right = n-1 , bottom = m-1;
        while( curr!= null && top <= bottom && left <= right)
        {
            for(int i=left;i<=right && curr != null;i++)
            {
                a[top][i] = curr.val;
                curr = curr.next;
            }
            top++;
            for(int i=top;i<=bottom && curr != null;i++)
                {
                    a[i][right] = curr.val;
                    curr = curr.next;
                }
            right--;
            if(top <= bottom)
            {
                for(int i=right;i>=left && curr != null;i--)
                    {
                        a[bottom][i] = curr.val;
                        curr = curr.next;
                    }
                bottom--;
            }
            if(left <= right)
            {
                for(int i=bottom;i>=top && curr != null;i--)
                    {
                        a[i][left] = curr.val;
                        curr = curr.next;
                    }
                left++;
            }
        }
        return a;
    }
}