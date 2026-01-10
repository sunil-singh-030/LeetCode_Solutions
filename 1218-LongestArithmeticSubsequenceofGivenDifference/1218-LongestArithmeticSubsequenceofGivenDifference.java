// Last updated: 1/10/2026, 1:11:23 PM
1class Solution {
2    public int longestSubsequence(int[] arr, int difference) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        int maxLen = 1;
5        int n = arr.length;
6        for (int i=n-1 ; i>=0 ; i--){
7            int num = arr[i];
8            if (map.containsKey(num+difference)){
9                int len = 1 + map.get(num+difference);
10                map.put(num,len);
11                maxLen = Math.max(maxLen,len);
12            }
13            else{
14                if (!map.containsKey(num)){
15                    map.put(num,1);
16                }
17            }
18        }
19        return maxLen;
20    }
21}