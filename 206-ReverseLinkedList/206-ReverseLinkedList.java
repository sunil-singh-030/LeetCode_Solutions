// Last updated: 10/22/2025, 8:26:59 AM
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
        ListNode parent = null;
        ListNode child = head;
        while (child!=null){
            ListNode nextNode = child.next;
            ListNode temp = child;
            child.next = parent;
            parent = temp;
            child = nextNode;
        }
        return parent;
    }
    
}