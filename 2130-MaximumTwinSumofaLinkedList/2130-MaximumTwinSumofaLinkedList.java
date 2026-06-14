// Last updated: 6/14/2026, 6:34:10 AM
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
12    public int pairSum(ListNode head) {
13        ListNode temp = head;
14        int n = 0;
15        while (temp!=null){
16            n++;
17            temp = temp.next;
18        }
19        n /= 2;
20        ListNode prev = null;
21        ListNode curr = head;
22        while (n-->0){
23            prev = curr;
24            curr = curr.next;
25            
26        }
27        ListNode mid = prev;
28        prev = null;
29        while (curr!=null){
30            ListNode tempNode = curr.next;
31            curr.next = prev;
32            prev = curr;
33            curr = tempNode;
34        }
35        mid.next = prev;
36
37        ListNode node1 = head;
38        ListNode node2 = prev;
39        int maxSum = 0;
40        while (node2!=null){
41            maxSum = Math.max(maxSum,node1.val+node2.val);
42            node1 = node1.next;
43            node2 = node2.next;
44        }
45        return maxSum;
46        
47    }
48}