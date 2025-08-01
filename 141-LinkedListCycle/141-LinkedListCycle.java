// Last updated: 8/1/2025, 7:10:42 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // List<ListNode> ls = new ArrayList();
        // ListNode curr = head;
        // boolean flag = false;
        // while (!flag && curr!=null){
        //     if (ls.contains(curr)){
        //         return true;
        //     }
        //     else{
        //         ls.add(curr);
        //         curr = curr.next;
        //     }
        // }
        // return false;

        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
}