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
    public ListNode swapPairs(ListNode head) {
        // Base case: if less than 2 nodes remain
        if (head == null || head.next == null) {
            return head;
        }
        
        // Nodes to be swapped
        ListNode first = head;
        ListNode second = head.next;
        
        // Swapping and recursive call
        first.next = swapPairs(second.next);
        second.next = first;
        
        // second is now the head of this swapped pair
        return second;
    }
}