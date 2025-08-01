// Last updated: 8/1/2025, 7:11:38 AM
import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] lmin = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i=0 ; i<n ; i++){
            while (!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            lmin[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();

        int[] rmin = new int[n];
        for (int i=n-1 ; i>=0 ; i--){
            while (!st.isEmpty() && heights[i]<=heights[st.peek()]){
                st.pop();
            }
            rmin[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        int ans = 0;
        for (int i=0 ; i<n ; i++){
            int w = rmin[i]-lmin[i]-1;
            if (w==-1){
                w = 1;
            }
            ans = Math.max(ans,heights[i]*w);
            //System.out.println(rmin[i]+" "+lmin[i]);
        }
        return ans;
    }
}
