// Last updated: 8/1/2025, 7:08:21 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        for (int i=n-1 ; i>=0 ; i--){
            while (!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            map.put(nums2[i],st.isEmpty() ? -1 : st.peek());
            st.push(nums2[i]);
        }
        int[] out = new int[nums1.length];
        for (int i=0 ; i<nums1.length ; i++){
            out[i] = map.get(nums1[i]);
        }
        return out;
    }
}