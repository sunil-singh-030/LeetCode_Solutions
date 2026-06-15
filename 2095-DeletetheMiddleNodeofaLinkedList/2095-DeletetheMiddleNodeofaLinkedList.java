// Last updated: 6/15/2026, 5:48:06 AM
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
12    public ListNode deleteMiddle(ListNode head) {
13        int len = 0;
14        ListNode curr = head;
15        while (curr!=null){
16            len++;
17            curr = curr.next;
18        }
19
20        if (len==1){
21            return null;
22        }
23
24        int move = len/2;
25        ListNode prev = null;
26        curr = head;
27
28        while (move-->0){
29            prev = curr;
30            curr = curr.next;
31        }
32        ListNode currNext = curr.next;
33        prev.next = currNext;
34        return head;
35    }
36}