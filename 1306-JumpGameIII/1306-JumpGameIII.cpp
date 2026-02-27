// Last updated: 2/27/2026, 4:41:23 PM
1class Solution {
2public:
3    bool helper(vector<int>& arr, int idx, vector<bool>& visited){
4
5        if (idx < 0 || idx >= arr.size())
6            return false;
7
8        if (visited[idx])
9            return false;
10
11        if (arr[idx] == 0)
12            return true;
13
14        visited[idx] = true;
15
16        bool goLeft = helper(arr, idx - arr[idx], visited);
17        bool goRight = helper(arr, idx + arr[idx], visited);
18
19        return goLeft || goRight;
20    }
21
22    bool canReach(vector<int>& arr, int start) {
23        vector<bool> visited(arr.size(), false);
24        return helper(arr, start, visited);
25    }
26};