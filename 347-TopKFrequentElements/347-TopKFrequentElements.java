// Last updated: 5/16/2026, 12:45:28 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for (int num : nums){
5            map.put(num,map.getOrDefault(num,0)+1);
6        }
7        int[][] arr = new int[map.size()][2];
8        int idx = 0;
9        for (int key : map.keySet()){
10            arr[idx][0] = key;
11            arr[idx][1] = map.get(key);
12            idx++;
13        }
14        Arrays.sort(arr,(a,b)->b[1]-a[1]);
15        int[] ans = new int[k];
16        for (int i=0 ; i<k ; i++){
17            ans[i] = arr[i][0];
18        }
19        return ans;
20    }
21}