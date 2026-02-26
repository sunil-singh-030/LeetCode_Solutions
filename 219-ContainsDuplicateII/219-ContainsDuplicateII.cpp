// Last updated: 2/26/2026, 11:13:00 AM
1class Solution {
2public:
3    bool containsNearbyDuplicate(vector<int>& nums, int k) {
4        unordered_map<int,int> s;
5        int n = nums.size();
6        for (int i=0 ; i<n ; i++){
7            int num = nums[i];
8            if (s.find(num)!=s.end()){
9                int prevIdx = s[num];
10                if (i-prevIdx<=k){
11                    return true;
12                }
13            }
14            s[num] = i;
15        }
16        return false;
17    }
18};