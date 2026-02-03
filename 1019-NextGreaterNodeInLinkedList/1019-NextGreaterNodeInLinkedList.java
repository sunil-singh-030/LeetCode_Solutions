// Last updated: 2/3/2026, 11:07:53 AM
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
12    Stack<Integer> st;
13    public int[] nextLargerNodes(ListNode head) {
14        st = new Stack<>();
15        int len = 0;
16        ListNode temp = head;
17        while (temp!=null){
18            len++;
19            temp = temp.next;
20        }
21        int[] ans = new int[len];
22        jaiBabaKi(head,0,ans);
23        return ans;
24    }
25    public void jaiBabaKi(ListNode curr, int idx, int[] ans){
26        if (curr.next==null){
27            st.push(curr.val);
28            return;
29        }
30        jaiBabaKi(curr.next,idx+1,ans);
31        int num = curr.val;
32        while (!st.isEmpty() && st.peek()<=num){
33            st.pop();
34        }
35        if (!st.isEmpty()){
36            ans[idx] = st.peek();
37        }
38        st.push(num);
39    }
40}