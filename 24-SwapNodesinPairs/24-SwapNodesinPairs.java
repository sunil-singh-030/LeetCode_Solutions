// Last updated: 5/15/2026, 7:47:52 AM
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
12    public ListNode swapPairs(ListNode head) {
13        if (head==null || head.next==null) return head;
14        return helper(head,true);
15    }
16    public ListNode helper(ListNode head, boolean swap){
17
18        if (head.next==null){
19            return head;
20        }
21        ListNode child = helper(head.next,!swap);
22        if (swap){
23            ListNode nextchild = child.next;
24            child.next = head;
25            head.next = nextchild;
26            return child;
27        }
28        else{
29            head.next = child;
30            return head;
31        }
32    }
33}