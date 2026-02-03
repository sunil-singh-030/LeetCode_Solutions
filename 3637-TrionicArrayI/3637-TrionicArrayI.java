// Last updated: 2/3/2026, 10:10:05 AM
1class Solution {
2    public boolean isTrionic(int[] nums) {
3        int n = nums.length;
4        int indp = -1;
5        for (int i=1 ; i<n ; i++){
6            if (nums[i]<=nums[i-1]){
7                indp = i-1;
8                break;
9            }
10        }
11        //System.out.println(indp);
12        if (indp==-1) return false;
13        int indq = -1;
14        for (int i=n-2 ; i>=indp ; i--){
15            if (nums[i]>=nums[i+1]){
16                indq = i+1;
17                break;
18            }
19        }
20        if (indq==-1) return false;
21        for (int i=indp+1 ; i<=indq ; i++){
22            if (nums[i]>=nums[i-1]){
23                return false;
24            }
25        }
26        //System.out.println(indp+" "+indq);
27        if (indp==0 || indq==n-1) return false;
28        return true;
29    }
30}