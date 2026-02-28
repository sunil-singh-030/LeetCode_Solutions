// Last updated: 2/28/2026, 9:55:24 PM
1class Solution {
2public:
3    vector<int> minDistinctFreqPair(vector<int>& nums) {
4        int freq[101];
5        for (int num : nums){
6            freq[num]++;
7        }
8        vector<int> v(2,-1);
9        for (int i=1 ; i<=100 ; i++){
10            if (freq[i]>0){
11                
12                for (int j=i+1 ; j<=100 ; j++){
13                    if (freq[j]>0 && freq[j]!=freq[i]){
14                        v[0] = i;
15                        v[1] = j;
16                        return v;
17                    }
18                }
19
20                
21            }
22        }
23        return v;
24    }
25};