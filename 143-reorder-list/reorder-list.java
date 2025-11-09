class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode mid = middleNode(head);
        ListNode head2 = reverseList(mid.next);
        mid.next = null;
        ListNode head1 = head;
        while (head1 != null && head2 != null) {
            ListNode temp1 = head1.next;
            ListNode temp2 = head2.next;
            head1.next = head2;
            head2.next = temp1;
            head1 = temp1;
            head2 = temp2;
        }
    }
}