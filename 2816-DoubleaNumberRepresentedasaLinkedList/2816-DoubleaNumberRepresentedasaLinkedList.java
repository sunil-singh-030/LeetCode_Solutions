// Last updated: 2/3/2026, 10:56:33 AM
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
12    public ListNode doubleIt(ListNode head) {
13        int carry = jaiBabaKi(head);
14        if (carry==0){
15            return head;
16        }
17        ListNode newNode = new ListNode();
18        newNode.val = carry;
19        newNode.next = head;
20        return newNode;
21    }
22    public int jaiBabaKi(ListNode currNode){
23        if (currNode.next==null){
24            int num = currNode.val;
25            num *= 2;
26            currNode.val = num%10;
27            num /= 10;
28            return num;
29        }
30        int carry = jaiBabaKi(currNode.next);
31        int num = currNode.val;
32        num *= 2;
33        num += carry;
34        currNode.val = num%10;
35        num /= 10;
36        return num;
37    }
38}