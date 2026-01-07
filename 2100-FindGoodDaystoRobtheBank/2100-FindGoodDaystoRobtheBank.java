// Last updated: 1/7/2026, 10:14:57 AM
1class Solution {
2    public List<Integer> goodDaysToRobBank(int[] security, int time) {
3        // 1 2 3 4 1 1 1
4        // 1 5 4 3 2 1 1
5        int n = security.length;
6        int[] ldecr = new int[n];
7        ldecr[0] = 1;
8        for (int i=1 ; i<n ; i++){
9            if (security[i]>security[i-1]){
10                ldecr[i] = 1;
11            }
12            else{
13                ldecr[i] = ldecr[i-1]+1;
14            }
15        }
16        //System.out.println(Arrays.toString(ldecr));
17        List<Integer> ans = new ArrayList<>();
18        int rdecr = 1;
19        if (Math.min(rdecr,ldecr[n-1])>=time+1){
20            ans.add(n-1);
21        }
22        for (int i=n-2 ; i>=0 ; i--){
23            if (security[i]>security[i+1]){
24                rdecr = 1;
25            }
26            else{
27                rdecr++;
28            }
29            if (Math.min(rdecr,ldecr[i])>=time+1){
30                ans.add(i);
31            }
32        }
33        return ans;
34    }
35}