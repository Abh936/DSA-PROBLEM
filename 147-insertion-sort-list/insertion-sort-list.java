class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1); // Dummy node to start sorted list
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // Save next node

            // Find the correct place to insert curr
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // Insert curr between prev and prev.next
            curr.next = prev.next;
            prev.next = curr;

            // Move to next node in the original list
            curr = next;
        }

        return dummy.next; // Return head of sorted list
    }
}