// Last updated: 5/16/2026, 12:01:07 PM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n = nums.length;
4        int ans = 1;
5        List<Integer> ls = new ArrayList<>();
6        for (int i=0 ; i<n ; i++){
7            if (ls.size()==0){
8                ls.add(nums[i]);
9            }
10            else{
11                if (nums[i]>ls.get(ls.size()-1)){
12                    ls.add(nums[i]);
13                }
14                else{
15                    int st = 0;
16                    int end = ls.size()-1;
17                    int idx = 0;
18                    while (st<=end){
19                        int mid = (st+end)/2;
20                        if (ls.get(mid)>=nums[i]){
21                            idx = mid;
22                            end = mid-1;
23                        }
24                        else{
25                            st = mid+1;
26                        }
27                    }
28                    ls.set(idx,nums[i]);
29                }
30                
31            }
32            ans = Math.max(ans,ls.size());
33        }
34        return ans;
35    }
36}