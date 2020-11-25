public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode prev = null;
        ListNode newHead = null;
        if(head == null) {
            return null;
        }
        ListNode cur = head;
        while (cur != null) {
            ListNode curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
}