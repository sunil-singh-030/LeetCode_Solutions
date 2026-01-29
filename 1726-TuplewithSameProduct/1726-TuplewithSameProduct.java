// Last updated: 1/29/2026, 11:30:44 AM
1class Solution {
2    public int tupleSameProduct(int[] nums) {
3        Arrays.sort(nums);
4        Map<Integer,Integer> map = new HashMap<>();
5        for (int i=0 ; i<nums.length-1 ; i++){
6            for (int j=i+1 ; j<nums.length ; j++){
7                if (map.containsKey(nums[i]*nums[j])){
8                    map.put(nums[i]*nums[j],map.get(nums[i]*nums[j])+1);
9                }
10                else{
11                    map.put(nums[i]*nums[j],1);
12                }
13            }
14        }
15        int cnt = 0;
16        for (Integer value : map.values()){
17            if (value>1){
18                cnt += allpair(value);
19            }
20        }
21        return cnt;
22    }
23    public static int allpair(int value){
24        int c1 = 1;
25        for (int i=(value-2+1) ; i<=value ; i++){
26            c1 *= i;
27        }
28        return c1*4;
29    }
30}