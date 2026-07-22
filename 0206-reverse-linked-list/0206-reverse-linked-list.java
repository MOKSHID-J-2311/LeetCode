
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next; 
            current.next = prev;          // Reverse link
            prev = current;               // Move prev forward
            current = next;               // Move current forward
        }

        return prev;
    }
}