// Last updated: 2/9/2026, 12:20:00 PM
1class Solution {
2    public List<Long> mergeAdjacent(int[] nums) {
3        Stack<Long> st = new Stack<>();
4        for (int num : nums){
5            long temp = (long) num;
6            while (!st.isEmpty() && st.peek()==temp){
7                st.pop();
8                temp *= 2;
9            }
10            st.push(temp);
11        }
12        List<Long> ans = new ArrayList<>();
13        while (!st.isEmpty()){
14            ans.add(st.pop());
15        }
16        Collections.reverse(ans);
17        return ans;
18    }
19}