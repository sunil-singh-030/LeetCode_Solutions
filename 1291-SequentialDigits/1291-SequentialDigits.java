// Last updated: 7/13/2026, 6:46:54 AM
1class Solution {
2    List<Integer> ans;
3    public List<Integer> sequentialDigits(int low, int high) {
4        ans = new ArrayList<>();
5        for (int i=1 ; i<=9 ; i++){
6            restart(i,low,high);
7        }
8        Collections.sort(ans);
9        return ans;
10    }
11    public void restart(int curr, int low, int high){
12        if (curr>high){
13            return ;
14        }
15
16        
17        int lasDig = curr%10;
18        if (lasDig<9){
19            int newNum = curr*10 + lasDig+1;
20            if (newNum>=low && newNum<=high){
21                ans.add(newNum);
22            }
23            restart(newNum,low,high);
24        }
25        
26        
27
28    }
29}