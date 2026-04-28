// Last updated: 4/28/2026, 12:07:55 PM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        
14        int len = 0;
15        ListNode temp = head;
16        while (temp!=null){
17            len++;
18            temp = temp.next;
19        }
20        if (n==len) return head.next;
21        int req = len-n;
22        req--;
23        temp = head;
24        while (req-->0){
25            temp = temp.next;
26        }
27        temp.next = temp.next.next;
28        return head;
29    }
30}