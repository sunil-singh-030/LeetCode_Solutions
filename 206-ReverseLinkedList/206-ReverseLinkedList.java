// Last updated: 10/22/2025, 8:12:04 AM
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
    public ListNode reverseList(ListNode head) {
        if (head==null){
            return null;
        }
        return helper(head,head.next);
    }
    public ListNode helper(ListNode parent , ListNode child){
        if (child==null){
            return parent;
        }
        ListNode newHead =  helper(child,child.next);
        ListNode temp = child;
        parent.next = null;
        child.next = parent;
        return newHead;
    }

}