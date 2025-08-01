// Last updated: 8/1/2025, 7:10:31 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempa = headA;
        ListNode tempb = headB;

        while (tempa!=tempb){
            if (tempa==null){
                tempa = headB;
            }
            else{
                tempa = tempa.next;
            }
            if (tempb==null){
                tempb = headA;
            }
            else{
                tempb = tempb.next;
            }
        }
        return tempa;
    }
}