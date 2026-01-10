// Last updated: 1/10/2026, 6:28:58 PM
1class Solution {
2    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
3        ListNode t1 = l1, t2 = l2;
4        int carry = 0;
5
6        ListNode ans = new ListNode(0); 
7        ListNode temp = ans;
8
9        while (t1 != null || t2 != null || carry > 0) {
10            int sum = carry;
11
12            if (t1 != null) {
13                sum += t1.val;
14                t1 = t1.next;
15            }
16            if (t2 != null) {
17                sum += t2.val;
18                t2 = t2.next;
19            }
20
21            temp.next = new ListNode(sum % 10); 
22            carry = sum / 10;
23            temp = temp.next;
24        }
25
26        return ans.next; 
27    }
28}
29