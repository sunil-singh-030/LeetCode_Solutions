// Last updated: 1/25/2026, 3:00:28 PM
1class Solution {
2    public long minimalKSum(int[] nums, int k) {
3        Arrays.sort(nums);
4        long tsum = 0;
5        int n = nums.length;
6        if (nums[0]>1){
7            long st = (long) 1;
8            int cnt = nums[0]-1;
9            int req = Math.min(k,cnt);
10            k -= req;
11            long end = st + req - 1;
12            long currSum = ((end)*(end+1)/2) - ((st)*(st-1)/2);
13            tsum += currSum;
14        }
15        
16        for (int i=1 ; i<n ; i++){
17            if (nums[i]>(nums[i-1]+1)){
18                long st = (long) nums[i-1]+1;
19                int cnt = nums[i] - nums[i-1] - 1;
20                int req = Math.min(k,cnt);
21                k -= req;
22                long end = st + req - 1;
23                long currSum = ((end)*(end+1)/2) - ((st)*(st-1)/2);
24                tsum += currSum;
25            }
26            
27            if (k==0){
28                break;
29            }
30        }
31        if (k>0){
32            long st = (long) nums[n-1]+1;
33            long end = st + k -1;
34            long currSum = ((end)*(end+1)/2) - ((st)*(st-1)/2);
35            tsum += currSum;
36        }
37        return tsum;
38    }
39}