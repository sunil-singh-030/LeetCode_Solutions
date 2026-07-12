// Last updated: 7/12/2026, 6:27:56 AM
1class Solution {
2    public int[] arrayRankTransform(int[] arr) {
3        int n = arr.length;
4        int[] temp = arr.clone();
5        Arrays.sort(temp);
6        HashMap<Integer,Integer> map = new HashMap<>();
7        int rnk = 1;
8        for (int i=0 ; i<n ; i++){
9            map.put(temp[i],rnk);
10            int idx = i+1;
11            while (idx<n && temp[idx]==temp[i]){
12                idx++;
13            }
14            rnk++;
15            i = idx-1;
16        }
17        int[] ans = new int[n];
18        for (int i=0 ; i<n ; i++){
19            ans[i] = map.get(arr[i]);
20        }
21        return ans;
22    }
23}