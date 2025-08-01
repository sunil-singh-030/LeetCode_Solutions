// Last updated: 8/1/2025, 7:02:13 AM
class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int cnt = 0;
        int si = 0;
        int ci = 0;
        while (ci<n){
            char ch = s.charAt(ci);
            int curcnt = map.getOrDefault(ch,0);
            map.put(ch,curcnt+1);
            curcnt++;
            if (curcnt==k){
                int add = n-ci;
                boolean flag = true;
                while (flag){
                    cnt += add;
                    char ch1 = s.charAt(si);
                    map.put(ch1,map.get(ch1)-1);
                    si++;
                    if (ch1==ch){
                        flag = false;
                    }
                }
            }
            ci++;
        }
        return cnt;
    }
}