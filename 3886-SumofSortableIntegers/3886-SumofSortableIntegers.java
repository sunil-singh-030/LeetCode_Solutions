// Last updated: 3/29/2026, 8:39:46 PM
1class Solution {
2    public int sortableIntegers(int[] nums) {
3        int n = nums.length;
4        int ans = 0;
5        for (int i=1 ; i*i<=n ; i++){
6            if (n%i==0){
7                int n1 = i;
8                int n2 = n/i;
9                if (check(n,nums,n1)){
10                    ans += n1;
11                }
12                if (n2!=n1 && check(n,nums,n2)){
13                    ans += n2;
14                }
15            }
16        }
17        return ans;
18    }
19    public boolean check(int n, int[] nums, int k){
20        int prevMax = 0;
21        
22        for (int i=0 ; i<n ; i+=k){
23            if (nums[i]<prevMax) return false;
24            int c = 0;
25            int max = nums[i];
26            for (int j=i+1 ; j<i+k ; j++){
27                if (nums[j]<prevMax) return false;
28                if (nums[j]<nums[j-1]){
29                    c++;
30                }
31                if (c==2) return false;
32                max = Math.max(max,nums[j]);
33            }
34            prevMax = max;
35            if (c==1){
36                if (nums[i]<nums[i+k-1]) return false;
37            }
38        }
39        return true;
40    }
41}