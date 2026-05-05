// Last updated: 5/5/2026, 7:25:55 AM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if (head==null) return null;
14        int len = 0;
15        ListNode temp = head;
16        ListNode endNode = null;
17        while (temp!=null){
18            len++;
19            endNode = temp;
20            temp = temp.next;
21        }
22        k %= len;
23        ListNode node1 = null;
24        ListNode node2 = null;
25        
26        if (k==0){
27            return head;
28        }
29        temp = head;
30        int move = len-k-1;
31        while (move-->0){
32            temp = temp.next;
33        }
34        node1 = temp;
35        node2 = temp.next;
36        node1.next = null;
37        endNode.next = head;
38        return node2;
39
40    }
41}