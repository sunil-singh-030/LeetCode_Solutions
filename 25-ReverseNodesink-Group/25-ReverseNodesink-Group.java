// Last updated: 10/26/2025, 10:18:16 AM
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
    public ListNode reverseKGroup(ListNode head, int k) {
        // size
        int size = 0;
        ListNode temp = head;
        while (temp!=null){
            size++;
            temp = temp.next;
        }
        // group cnt;
        int grpCnt = size/k;

        List<ListNode> stGroup = new ArrayList<>();
        List<ListNode> endGroup = new ArrayList<>();

        ListNode prev = null;
        ListNode curr = head;
        int currGrp = 0; 
        while (curr!=null && currGrp<grpCnt){
            int cntNode = 0;
            while (cntNode<k){
                if (cntNode==0){
                    stGroup.add(curr);
                }
                if (cntNode==k-1){
                    endGroup.add(curr);
                }
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
                cntNode++;
            }
            prev = null;
            currGrp++;
        }
        if (curr!=null){
            stGroup.add(curr);
            while (curr.next!=null){
                curr = curr.next;
            }
            endGroup.add(curr);
        }
        for (int i=0 ; i<stGroup.size()-1 ; i++){
            if (i<grpCnt-1){
                stGroup.get(i).next = endGroup.get(i+1);
            }
            else{
                stGroup.get(i).next = stGroup.get(i+1);
            }
            
        }
        return endGroup.get(0);
    }
}