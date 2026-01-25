// Last updated: 1/25/2026, 8:10:03 AM
1class Solution {
2    public int[] rotateElements(int[] nums, int k) {
3        List<Integer> ls = new ArrayList<>();
4        for (int num : nums){
5            if (num>-1){
6                ls.add(num);
7            }
8        }
9        int n = nums.length;
10        int temp = k;
11        k = 0;
12        if (ls.size()!=0){
13            k = temp%ls.size();
14        }
15        int idx = k;
16        for (int i=0 ; i<n ; i++){
17            if (ls.size()>0){
18                idx %= ls.size();
19            }
20            
21            if (nums[i]>-1){
22                nums[i] = ls.get(idx);
23                idx++;
24                
25            }
26        }
27        return nums;
28    }
29}