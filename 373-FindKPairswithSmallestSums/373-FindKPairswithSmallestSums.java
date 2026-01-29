// Last updated: 1/29/2026, 2:26:57 PM
1class Solution {
2    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
3        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
4            if (a[0]+a[1]!=b[0]+b[1]){
5                return -(a[0]+a[1]-(b[0]+b[1]));
6            }
7            else{
8                if (a[0]!=b[0]){
9                    return -(a[0]-b[0]);
10                }
11                else{
12                    return -(a[1]-b[1]);
13                }
14            }
15        });
16        for (int n1 : nums1){
17            for (int n2 : nums2){
18                if (pq.size()<k){
19                    pq.add(new int[]{n1,n2});
20                }
21                else{
22                    int[] cp = pq.peek();
23                    if (n1+n2<cp[0]+cp[1]){
24                        pq.poll();
25                        pq.add(new int[]{n1,n2});
26                    }
27                    else if (n1+n2==cp[0]+cp[1]){
28                        if (n1<cp[0] || (n1==cp[0] && n2<cp[1])){
29                            pq.poll();
30                            pq.add(new int[]{n1,n2});
31                        }
32                        else{
33                            break;
34                        }
35                    }
36                    else{
37                        break;
38                    }
39                }
40            }
41        }
42        List<List<Integer>> ans = new ArrayList<>();
43        while (!pq.isEmpty()){
44            int[] cp = pq.poll();
45            List<Integer> temp = new ArrayList<>();
46            temp.add(cp[0]);
47            temp.add(cp[1]);
48            ans.add(temp);
49        }
50        return ans;
51    }
52}