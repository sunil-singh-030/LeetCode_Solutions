// Last updated: 10/31/2025, 12:12:24 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b)->a.val-b.val);
        for (int i=0 ; i<lists.length  ; i++){
            if (lists[i]!=null){
                pq.add(lists[i]);
            }
        }
        ListNode Dummy = new ListNode();
        ListNode temp = Dummy;
        while (!pq.isEmpty()){
            ListNode currNode = pq.poll();
            Dummy.next = currNode;
            Dummy = Dummy.next;
            if (currNode.next!=null){
                pq.add(currNode.next);
            }
        }
        return temp.next;
    }
}