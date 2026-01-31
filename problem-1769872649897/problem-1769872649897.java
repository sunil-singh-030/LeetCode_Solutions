// Last updated: 1/31/2026, 8:47:29 PM
1class Solution {
2    public int longestSubsequence(int[] nums) {
3        int ans = 0;
4        int bitpos = 1;
5        int n = nums.length;
6        int[][] helper = new int[n][32];
7        for (int i=0 ; i<n ; i++){
8            int num = nums[i];
9            jaibabaki(num,i,helper);
10        }
11        while (bitpos<33){
12            List<Integer> ls = new ArrayList<>();
13            for (int i=0 ; i<n ; i++){
14                int num = nums[i];
15                if (helper[i][bitpos-1]==1){
16                    if (ls.isEmpty()){
17                        ls.add(num);
18                    }
19                    else if (ls.get(ls.size()-1)<num){
20                        ls.add(num);
21                    }
22                    else{
23                        int st = 0;
24                        int end = ls.size()-1;
25                        int idx = -1;
26                        while (st<=end){
27                            int mid = (st+end)/2;
28                            if (ls.get(mid)>=num){
29                                idx = mid;
30                                end = mid-1;
31                            }
32                            else{
33                                st = mid+1;
34                            }
35                        }
36                        if (idx!=-1){
37                            ls.set(idx,num);
38                        }
39                    }
40                    ans = Math.max(ans,ls.size());
41                }
42            }
43
44            bitpos++;
45        }
46        return ans;
47        
48    }
49    public void jaibabaki(int num, int i, int[][] helper){
50        int c = 1;
51        while (num>0){
52            int bit = num%2;
53            if (bit==1){
54                helper[i][c-1] = 1;
55            }
56            c++;
57            num /= 2;
58        }
59        
60    }
61}