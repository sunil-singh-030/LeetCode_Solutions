// Last updated: 1/29/2026, 2:59:25 PM
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
22        while (ans.size()<k){
23            int[] cp = pq.poll();
24            List<Integer> temp = new ArrayList<>();
25            temp.add(nums1[cp[0]]);
26            temp.add(nums2[cp[1]]);
27            ans.add(temp);
28            if (cp[0]+1<m && !visited.contains((cp[0]+1)+" "+cp[1])){
29                pq.add(new int[]{cp[0]+1,cp[1],nums1[cp[0]+1]+nums2[cp[1]]});
30                visited.add((cp[0]+1)+" "+cp[1]);
31            }
32            if (cp[1]+1<n && !visited.contains(cp[0]+" "+(cp[1]+1))){
33                pq.add(new int[]{cp[0],cp[1]+1,nums1[cp[0]]+nums2[cp[1]+1]});
34                visited.add(cp[0]+" "+(cp[1]+1));
35            }
36
37        }
38        return ans;
39        
40    }
41}