// Last updated: 3/14/2026, 8:08:50 PM
1class Solution {
2    public long gcdSum(int[] nums) {
3        int n = nums.length;
4        int max = 0;
5        long[] arr = new long[n];
6        for (int i=0 ; i<n ; i++){
7            max = Math.max(max,nums[i]);
8            arr[i] = gcd((long) nums[i],(long) max);
9            //System.out.println(arr[i]);
10        }
11        Arrays.sort(arr);
12        // System.out.println(Arrays.toString(arr));
13        long ans = 0;
14        for (int i=0 ; i<arr.length/2 ; i++){
15            ans += gcd(arr[i],arr[arr.length-1-i]);
16        }
17        return ans;
18    }
19    public long gcd(long a, long b){
20        while (b%a!=0){
21            long rem = b%a;
22            b = a;
23            a = rem;
24        }
25        return a;
26    }
27}