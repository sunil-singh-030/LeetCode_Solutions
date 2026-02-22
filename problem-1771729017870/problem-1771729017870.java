// Last updated: 2/22/2026, 8:26:57 AM
1class Solution {
2    HashMap<String,Integer> map;
3    public int countSequences(int[] nums, long k) {
4        int n = nums.length;
5        map = new HashMap<>();
6        
7        return jaiBabaKi(nums,0,k,(long) 1, (long) 1);
8    }
9    public int jaiBabaKi(int[] nums, int idx, long k, long num, long den){
10        if (idx==nums.length){
11            if (num%den!=0){
12                return 0;
13            }
14            long res = num/den;
15            return res==k ? 1 : 0;
16        }
17        String key = idx+" "+num+" "+den;
18        if (map.containsKey(key)){
19            return map.get(key);
20        }
21        int skip = jaiBabaKi(nums,idx+1,k,num,den);
22        int mul = jaiBabaKi(nums,idx+1,k,num*nums[idx],den);
23        int div = jaiBabaKi(nums,idx+1,k,num,den*nums[idx]);
24        
25        map.put(key,skip+mul+div);
26        return skip+mul+div;
27    }
28}