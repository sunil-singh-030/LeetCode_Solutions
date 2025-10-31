// Last updated: 10/31/2025, 12:08:32 PM
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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        st.push(slow.val);
        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            st.push(slow.val);
        }
        if (fast.next==null){
            st.pop();
        }
        slow = slow.next;
        while (slow!=null){
            if (slow.val!=st.pop()) return false;
            slow = slow.next;
        }
        return true;
    }
}