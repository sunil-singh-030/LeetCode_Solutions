// Last updated: 3/8/2026, 7:48:55 AM
1class Solution {
2    static boolean flag = false;
3    static String ans = ""; 
4    static List<String> ls = new ArrayList<>();
5    public String findDifferentBinaryString(String[] nums) {
6        ls = new ArrayList<>();
7        for (String s : nums){
8            ls.add(s);
9        }
10        int n = nums[0].length();
11        lets(n,"");
12        return ans;
13    }
14    public static void lets(int n , String str){
15        if (n==0){
16            boolean avl = true;
17            for (String s : ls){
18                if (s.equals(str)){
19                    avl = false;
20                    ls.remove(String.valueOf(s));
21                        break;
22                }
23            }
24            if (avl){
25                flag = true;
26                ans = str;
27            }
28            return;
29        }
30        lets(n-1,str+'0');
31        lets(n-1,str+'1');
32    }
33}