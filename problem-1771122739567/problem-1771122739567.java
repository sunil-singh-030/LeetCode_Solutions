// Last updated: 2/15/2026, 8:02:19 AM
1class Solution {
2    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
3        TreeSet<Integer> set = new TreeSet<>();
4        for (int num : bulbs){
5            if (!set.contains(num)){
6                set.add(num);
7            }
8            else{
9                set.remove(num);
10            }
11        }
12        List<Integer> ans = new ArrayList<>();
13        for (int num : set){
14            ans.add(num);
15        }
16        return ans;
17    }
18}