// Last updated: 12/19/2025, 12:00:37 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] newarr = new int[2*n];
        for (int i=0 ; i<n ; i++){
            newarr[i] = nums[i];
        }
        for (int i=0 ; i<n ; i++){
            newarr[n+i] = nums[i];
        }
        Arrays.fill(nums,-1);
        Stack<Integer> st = new Stack<>();
        for (int i=2*n-1 ; i>=0 ; i--){
            while (!st.isEmpty() && newarr[i]>=st.peek()){
                st.pop();
            }
            if (!st.isEmpty() && i<n){
                nums[i] = st.peek();
            }
            st.push(newarr[i]);
        }

        
        return nums;
    }
}