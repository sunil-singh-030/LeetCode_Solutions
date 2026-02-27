// Last updated: 2/27/2026, 4:40:14 PM
1class Solution {
2public:
3    bool helper(vector<int>& arr, int idx, vector<bool>& visited){
4        if (arr[idx]==0){
5            return true;
6        }
7        if (visited[idx]){
8            return false;
9        }
10        bool goLeft = false;
11        if (idx-arr[idx]>=0){
12            visited[idx] = true;
13            goLeft = helper(arr,idx-arr[idx],visited);
14            visited[idx] = false;
15        }
16        bool goRight = false;
17        if (idx+arr[idx]<arr.size()){
18            visited[idx] = true;
19            goRight = helper(arr,idx+arr[idx],visited);
20            visited[idx] = false;
21        }
22        return goLeft || goRight;
23    }
24    bool canReach(vector<int>& arr, int start) {
25        vector<bool> visited(arr.size(),false);
26        return helper(arr,start,visited);
27    }
28};