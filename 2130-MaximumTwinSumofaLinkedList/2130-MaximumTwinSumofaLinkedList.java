// Last updated: 6/14/2026, 6:15:40 AM
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
21        temp = head;
22        while (n-->0){
23            ls.add(temp.val);
24            temp = temp.next;
25        }
26        int idx = ls.size()-1;
27        int maxSum = 0;
28        while (temp!=null){
29            maxSum = Math.max(maxSum,ls.get(idx)+temp.val);
30            idx--;
31            temp = temp.next;
32        }
33        return maxSum;
34    }
35}