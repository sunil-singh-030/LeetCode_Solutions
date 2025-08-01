// Last updated: 8/1/2025, 7:05:38 AM
class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int cnt = 0;
        int si = 0;
        int ci = 0;
        Map<Character,Integer> map = new HashMap<>();
        while (ci<n){
            char ch = s.charAt(ci);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if (map.size()==3){
                int add = n-ci;
                while (map.size()==3){
                    cnt += add;
                    char ch1 = s.charAt(si);
                    map.put(ch1,map.getOrDefault(ch1,0)-1);
                    if (map.get(ch1)==0){
                        map.remove(ch1);
                    }
                    si++;
                }
            }
            ci++;
        }
        if (map.size()==3){
            int add = n-ci;
            while (map.size()==3){
                cnt += add;
                char ch1 = s.charAt(si);
                map.put(ch1,map.getOrDefault(ch1,0)-1);
                if (map.get(ch1)==0){
                    map.remove(ch1);
                }
                si++;
            }
        }
        return cnt;
    }
}