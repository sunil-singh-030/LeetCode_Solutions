// Last updated: 7/18/2026, 7:02:14 AM
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
15        for (int i=0 ; i<k ; i++){
16            ListNode node = lists[i];
17            if (node==null) continue;
18            pq.add(node);
19        }
20        ListNode temp = new ListNode(0);
21        ListNode temp1 = temp;
22        
23        while (!pq.isEmpty()){
24            ListNode currNode = pq.poll();
25            ListNode newNode = new ListNode(currNode.val);
26            temp.next = newNode;
27            temp = temp.next;
28            
29            if (currNode.next!=null){
30                pq.add(currNode.next);
31            }
32            
33        }
34        return temp1.next;
35        
36    }
37
38}