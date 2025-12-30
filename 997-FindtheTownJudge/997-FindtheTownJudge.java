// Last updated: 12/30/2025, 10:08:58 AM
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        HashSet<Integer> set = new HashSet<>();
4        HashMap<Integer,Integer> map = new HashMap<>();
5        for (int i=1 ; i<=n ; i++){
6            set.add(i);
7        }
8        for (int[] arr : trust){
9            if (set.contains(arr[0])){
10                set.remove(arr[0]);
11            }
12            map.put(arr[1],map.getOrDefault(arr[1],0)+1);
13        }
14        if (set.size()==1) {
15            for (int num : set){
16                if (map.getOrDefault(num,0)==n-1){
17                    return num;
18                }
19            }
20        }
21        return -1;
22    }
23}