// Last updated: 7/21/2026, 9:18:43 PM
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
13        
14        if (head==null) return null;
15        
16        ListNode prev = null;
17        ListNode curr = head;
18
19        while (curr!=null){
20            ListNode temp = curr.next;
21            
22            curr.next = prev;
23            prev = curr;
24            curr = temp;
25        }
26        
27        return prev;
28
29        
30    }
31
32}