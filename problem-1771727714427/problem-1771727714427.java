// Last updated: 2/22/2026, 8:05:14 AM
1class Solution {
2    public int scoreDifference(int[] nums) {
3        int s1 = 0;
4        int s2 = 0;
5        boolean turn = true;
6        int n = nums.length;
7        for (int i=0 ; i<n ; i++){
8            int num = nums[i];
9            if (nums[i]%2==1 ){
10                turn = !turn;
11            }
12            if ((i+1)%6==0){
13                turn = !turn;
14            }
15            
16            if (turn){
17                s1 += nums[i];
18            }
19            else{
20                s2 += nums[i];
21            }
22            //System.out.println(s1+" "+s2);
23        }
24        return s1-s2;
25    }
26}