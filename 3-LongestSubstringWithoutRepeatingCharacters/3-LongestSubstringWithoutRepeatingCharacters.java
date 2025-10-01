// Last updated: 10/1/2025, 7:06:27 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int mlen = 0;
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int si = 0;
        int ci = 0;
        while (ci<n){
            char curr = s.charAt(ci);
            int cnt = map.getOrDefault(curr,0);
            if (cnt==0){
                map.put(curr,1);
            }
            else{
                mlen = Math.max(mlen,ci-si);
                while (true){
                    char ch = s.charAt(si);
                    if (ch==curr){
                        cnt--;
                    }
                    else{
                        map.put(ch,map.getOrDefault(ch,0)-1);
                    }
                    si++;
                    if (cnt==0){
                        break;
                    }
                }
                map.put(curr,1);
            }
            ci++;
            //System.out.println(ci+" "+si+" "+mlen);
        }
        //System.out.println(ci+" "+si+" "+mlen);
        mlen = Math.max(mlen,ci-si);
        return mlen;
    }
}
