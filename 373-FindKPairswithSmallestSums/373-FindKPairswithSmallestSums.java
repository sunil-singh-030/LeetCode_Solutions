// Last updated: 1/29/2026, 2:55:07 PM
1class Solution {
2    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
3        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
4            if (a[2]!=b[2]){
5                return a[2]-b[2];
6            }
7            else{
8                if (nums1[a[0]]!=nums1[b[0]]){
9                    return nums1[a[0]]-nums1[b[0]];
10                }
11                else{
12                    return nums2[a[1]]-nums2[b[1]];
13                }
14            }
15        });
16        HashSet<String> visited = new HashSet<>();
17        pq.add(new int[]{0,0,nums1[0]+nums2[0]});
18        visited.add(0+" "+0);
19        List<List<Integer>> ans = new ArrayList<>();
20        int m = nums1.length;
21        int n = nums2.length;
22        while (ans.size() < k && !pq.isEmpty()) {
23            int[] cp = pq.poll();
24            ans.add(List.of(nums1[cp[0]], nums2[cp[1]]));
25
26            int i = cp[0], j = cp[1];
27
28            if (i + 1 < m && visited.add((i + 1) + " " + j)) {
29                pq.add(new int[]{i + 1, j, nums1[i + 1] + nums2[j]});
30            }
31
32            if (j + 1 < n && visited.add(i + " " + (j + 1))) {
33                pq.add(new int[]{i, j + 1, nums1[i] + nums2[j + 1]});
34            }
35        }
36
37        return ans;
38        
39    }
40}