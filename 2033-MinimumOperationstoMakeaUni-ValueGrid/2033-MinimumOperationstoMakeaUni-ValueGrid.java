// Last updated: 4/28/2026, 10:23:18 AM
1class Solution {
2    public int minOperations(int[][] grid, int x) {
3        int rem = -1;
4        List<Integer> ls = new ArrayList<>();
5        for (int[] arr : grid){
6            for (int num : arr){
7                ls.add(num);
8                if (rem!=-1){
9                    if (rem!=(num%x)){
10                        return -1;
11                    }
12                    
13                }
14                else{
15                    rem = num%x;
16                }
17            }
18        }
19        Collections.sort(ls);
20        //System.out.println(ls);
21        int target = ls.get(ls.size()/2);
22        int cnt = 0;
23        for (int i=0 ; i<ls.size() ; i++){
24            cnt += (Math.abs(ls.get(i)-target)/x);
25        }
26        return cnt;
27        
28        
29
30    }
31}