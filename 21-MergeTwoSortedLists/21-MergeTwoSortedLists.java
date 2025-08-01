// Last updated: 8/1/2025, 7:12:51 AM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        ListNode tempa = list1;
        ListNode tempb = list2;
        while (tempa!=null && tempb!=null){
            if (tempa.val<tempb.val){
                dummy.next = tempa;
                dummy = dummy.next;
                tempa = tempa.next;
            }
            else{
                dummy.next = tempb;
                dummy = dummy.next;
                tempb = tempb.next;
            }
        }
        // while (tempa!=null){
        //     dummy.next = tempa;
        //     dummy = dummy.next;
        //     tempa = tempa.next;
        // }
        // while (tempb!=null){
        //     dummy.next = tempb;
        //     dummy = dummy.next;
        //     tempb = tempb.next;
        // }
        if (tempa==null){
            dummy.next = tempb;
        }
        if (tempb==null){
            dummy.next = tempa;
        }
        return temp.next;
    }
}