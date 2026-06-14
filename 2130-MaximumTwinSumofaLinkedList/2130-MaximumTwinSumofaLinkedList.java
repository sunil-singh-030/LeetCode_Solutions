// Last updated: 6/14/2026, 6:33:51 AM
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
13        List<Integer> ls = new ArrayList<>();
14        ListNode temp = head;
15        int n = 0;
16        while (temp!=null){
17            n++;
18            temp = temp.next;
19        }
20        n /= 2;
21        ListNode prev = null;
22        ListNode curr = head;
23        while (n-->0){
24            prev = curr;
25            curr = curr.next;
26            
27        }
28        ListNode mid = prev;
29        prev = null;
30        while (curr!=null){
31            ListNode tempNode = curr.next;
32            curr.next = prev;
33            prev = curr;
34            curr = tempNode;
35        }
36        mid.next = prev;
37
38        ListNode node1 = head;
39        ListNode node2 = prev;
40        int maxSum = 0;
41        while (node2!=null){
42            maxSum = Math.max(maxSum,node1.val+node2.val);
43            node1 = node1.next;
44            node2 = node2.next;
45        }
46        return maxSum;
47        
48    }
49}