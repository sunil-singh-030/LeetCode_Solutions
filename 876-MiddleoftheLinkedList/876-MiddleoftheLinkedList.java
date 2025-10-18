// Last updated: 10/18/2025, 12:57:59 PM
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
    public ListNode middleNode(ListNode head) {
        if (head.next==null){
            return head;
        }
        if (head.next.next==null){
            return head.next;
        }
         ListNode slow = head;
         ListNode fast = head;
         boolean incr = false;
         while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast.next!=null && fast.next.next==null){
                incr = true;
            }
         }
         if (incr){
            slow = slow.next;
         }
         return slow;
    }
}