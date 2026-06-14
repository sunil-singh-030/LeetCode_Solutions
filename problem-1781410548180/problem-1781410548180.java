// Last updated: 6/14/2026, 9:45:48 AM
1class Solution {
2    public long maxRatings(int[][] units) {
3        int m = units.length;
4        int n = units[0].length;
5
6        if (n==1){
7            long tsum = 0;
8            for (int[] arr : units){
9                tsum += arr[0];
10            }
11            return tsum;
12        }
13
14        long[][] arr = new long[m][2];
15        for (int i=0 ; i<m ; i++){
16            int[] temp = units[i];
17            Arrays.sort(temp);
18            arr[i][0] = (long) temp[0];
19            arr[i][1] = (long) temp[1];
20        }
21        if (m==1){
22            return arr[0][0];
23        }
24        Arrays.sort(arr,(a,b)->{
25            if (a[0]!=b[0]){
26                return  (int) (a[0]-b[0]);
27            }
28            return (int) (a[1]-b[1]);
29        });
30        long minSecond = Long.MAX_VALUE;
31        long tsum = arr[0][0];
32        for (int i=0 ; i<m ; i++){
33            tsum += arr[i][1];
34            minSecond = Math.min(minSecond,arr[i][1]);
35        }
36        return tsum-minSecond;
37    }
38}