// Last updated: 6/14/2026, 6:11:51 AM
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
15        while (temp!=null){
16            ls.add(temp.val);
17            temp = temp.next;
18        }
19        int maxSum = 0;
20        for (int i=0 ; i<ls.size()/2 ; i++){
21            maxSum = Math.max(maxSum,ls.get(i)+ls.get(ls.size()-1-i));
22        }
23        return maxSum;
24    }
25}