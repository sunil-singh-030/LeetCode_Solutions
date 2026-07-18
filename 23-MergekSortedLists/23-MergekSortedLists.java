// Last updated: 7/18/2026, 7:03:13 AM
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
12    public ListNode mergeKLists(ListNode[] lists) {
13        int k = lists.length;
14        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
15        for (ListNode node : lists){
16            if (node!=null){
17                pq.add(node);
18            }
19            
20        }
21        ListNode temp = new ListNode(0);
22        ListNode temp1 = temp;
23        
24        while (!pq.isEmpty()){
25            ListNode currNode = pq.poll();
26            ListNode newNode = new ListNode(currNode.val);
27            temp.next = newNode;
28            temp = temp.next;
29            
30            if (currNode.next!=null){
31                pq.add(currNode.next);
32            }
33            
34        }
35        return temp1.next;
36        
37    }
38
39}