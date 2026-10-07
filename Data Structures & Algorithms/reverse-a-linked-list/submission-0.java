class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode current = head;

        while(current!= null)
        {
            ListNode forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }

        return previous;

        
    }
}
