// Last updated: 5/20/2026, 1:04:36 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseList(ListNode head) {
13        if (head==null) return null;
14        ListNode[] ls = helper(head);
15        return ls[0];
16    }
17    public ListNode[] helper(ListNode head){
18        if (head.next==null){
19            return new ListNode[]{head,head};
20        }
21        
22        ListNode[] ls = helper(head.next);
23        ls[1].next = head;
24        head.next = null;
25        return new ListNode[]{ls[0],head};
26    }
27}