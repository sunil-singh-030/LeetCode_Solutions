// Last updated: 1/12/2026, 9:30:01 PM
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
14        HashMap<Integer,Integer> map11 = new HashMap<>();
15        HashMap<Integer,Integer> map22 = new HashMap<>();
16        for (int key : map1.keySet()){
17            map11.put(key,(n/2+(n%2))-map1.get(key));
18        }
19        for (int key : map2.keySet()){
20            map22.put(key,(n/2)-map2.get(key));
21        }
22        // System.out.println(map11);
23        // System.out.println(map22);
24        int[][] arr1 = new int[map11.size()][2];
25        int idx = 0;
26        for (int key : map11.keySet()){
27            arr1[idx][0] = key;
28            arr1[idx][1] = map11.get(key);
29            idx++;
30        }
31        Arrays.sort(arr1,(a,b)->a[1]-b[1]);
32        int[][] arr2 = new int[map22.size()][2];
33        idx = 0;
34        for (int key : map22.keySet()){
35            arr2[idx][0] = key;
36            arr2[idx][1] = map22.get(key);
37            idx++;
38        }
39        Arrays.sort(arr2,(a,b)->a[1]-b[1]);
40        int ans = Integer.MAX_VALUE;
41        for (int[] a : arr1){
42            int curr = a[1];
43            int tar = a[0];
44            boolean found = false;
45            for (int i=0 ; i<arr2.length ; i++){
46                if (tar!=arr2[i][0]){
47                    found = true;
48                    curr += arr2[i][1];
49                    break;
50                }
51            }
52            if (!found){
53                curr += n/2;
54            }
55            ans = Math.min(ans,curr);
56        }
57        return ans;
58    }
59}