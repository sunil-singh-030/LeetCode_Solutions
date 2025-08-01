// Last updated: 8/1/2025, 7:09:43 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        node.val = node.next.val;
        node.next = node.next.next;
        temp.next = null;
    }
}