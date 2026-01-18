// Last updated: 1/18/2026, 8:26:58 PM
1class Solution {
2    public int minimumOperations(int[] nums) {
3        int n = nums.length;
4        HashMap<Integer,Integer> map1 = new HashMap<>();
5        HashMap<Integer,Integer> map2 = new HashMap<>();
6        for (int i=0 ; i<n ; i++){
7            if (i%2==0){
8                map1.put(nums[i],map1.getOrDefault(nums[i],0)+1);
9            }
10            else{
11                map2.put(nums[i],map2.getOrDefault(nums[i],0)+1);
12            }
13        }
14        // 
15        HashMap<Integer,Integer> map11 = new HashMap<>();
16        HashMap<Integer,Integer> map22 = new HashMap<>();
17        for (int key : map1.keySet()){
18            map11.put(key,(n/2+(n%2))-map1.get(key));
19        }
20        for (int key : map2.keySet()){
21            map22.put(key,(n/2)-map2.get(key));
22        }
23        int[][] arr1 = new int[map11.size()][2];
24        int idx = 0;
25        for (int key : map11.keySet()){
26            arr1[idx][0] = key;
27            arr1[idx][1] = map11.get(key);
28            idx++;
29        }
30        
31        int[][] arr2 = new int[map22.size()][2];
32        idx = 0;
33        for (int key : map22.keySet()){
34            arr2[idx][0] = key;
35            arr2[idx][1] = map22.get(key);
36            idx++;
37        }
38        Arrays.sort(arr2,(a,b)->a[1]-b[1]);
39        int ans = Integer.MAX_VALUE;
40        for (int[] a : arr1){
41            int curr = a[1];
42            int tar = a[0];
43            boolean found = false;
44            for (int i=0 ; i<arr2.length ; i++){
45                if (tar!=arr2[i][0]){
46                    found = true;
47                    curr += arr2[i][1];
48                    break;
49                }
50            }
51            if (!found){
52                curr += n/2;
53            }
54            ans = Math.min(ans,curr);
55        }
56        return ans;
57    }
58}