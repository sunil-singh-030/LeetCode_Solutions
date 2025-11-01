// Last updated: 11/1/2025, 3:36:20 PM
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        return helper(head,null,set);
    }
    public ListNode helper(ListNode child, ListNode parent, HashSet<Integer> set){
        if (child==null){
            return null;
        }
        if (!set.contains(child.val)){
            child.next = helper(child.next,child,set);
            return child;
        }
        else{
            if (parent==null){
                return helper(child.next,null,set);
            }
            else{
                return helper(child.next,parent,set);
            }
        }
    }
}