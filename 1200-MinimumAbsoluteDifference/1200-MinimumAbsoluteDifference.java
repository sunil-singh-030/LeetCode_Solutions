// Last updated: 1/26/2026, 8:15:46 PM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        int n = arr.length;
4        Arrays.sort(arr);
5        int mindiff = Integer.MAX_VALUE;
6        for (int i=1 ; i<n ; i++){
7            mindiff = Math.min(mindiff,Math.abs(arr[i]-arr[i-1]));
8        }
9        List<List<Integer>> ls = new ArrayList<>();
10        for (int i=1 ; i<n ; i++){
11            if (Math.abs(arr[i]-arr[i-1])==mindiff){
12                List<Integer> ls1 = new ArrayList<>();
13                ls1.add(arr[i-1]);
14                ls1.add(arr[i]);
15                ls.add(ls1);
16            }
17        }
18        return ls;
19    }
20}