// Last updated: 1/10/2026, 6:29:24 PM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode t1 = l1;
14        ListNode t2 = l2;
15        int carry = 0;
16        ListNode ans = new ListNode();
17        ListNode temp = ans;
18        while (t1!=null && t2!=null){
19            temp.next = new ListNode();
20            temp = temp.next;
21            int num = t1.val + t2.val + carry;
22            temp.val = num%10;
23            carry = num/10;
24            t1 = t1.next;
25            t2 = t2.next;
26            
27        }
28        while (t1!=null){
29            temp.next = new ListNode();
30            temp = temp.next;
31            int num = t1.val + carry;
32            temp.val = num%10;
33            carry = num/10;
34            t1 = t1.next;
35            
36        }
37        while (t2!=null){
38            temp.next = new ListNode();
39            temp = temp.next;
40            int num = t2.val + carry;
41            temp.val = num%10;
42            carry = num/10;
43            t2 = t2.next;
44            
45        }
46        while (carry>0){
47            temp.next = new ListNode();
48            temp = temp.next;
49            temp.val = carry%10;
50            carry /= 10;
51            
52        }
53        return ans.next;
54    }
55}