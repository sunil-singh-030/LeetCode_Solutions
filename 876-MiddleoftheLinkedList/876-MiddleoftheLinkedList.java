// Last updated: 10/18/2025, 12:51:09 PM
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
         ListNode temp = head;
         int len = 0;
         while (temp!=null){
            len++;
            temp = temp.next;
         }
         int req = len/2;
         temp = head;
         while (req>0){
            temp = temp.next;
            req--;
         }
         return temp;
    }
}