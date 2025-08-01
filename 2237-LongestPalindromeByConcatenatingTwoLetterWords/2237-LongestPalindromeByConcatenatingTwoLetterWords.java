// Last updated: 8/1/2025, 7:04:03 AM
class Solution {
    public int longestPalindrome(String[] words) {
        Map<String,Integer> map = new HashMap<>();
        int mlen = 0;
        List<String> ls = new ArrayList<>();
        for (String word : words){
            int cnt = map.getOrDefault(word,0);
            map.put(word,cnt+1);
            if (cnt==0){
                ls.add(word);
            }
        }
        boolean flag = true;
        for (int i=0 ; i<ls.size() ; i++){
            String s1 = ls.get(i);
            String s2 = s1.charAt(1)+""+s1.charAt(0);
            if (s1.charAt(0)==s1.charAt(1)){
                int cnt = map.get(s1);
                mlen += ((cnt/2)*4);
                if (flag && cnt%2==1){
                    mlen += 2;
                    flag = false;
                }
            }
            else{
                if (map.containsKey(s1) && map.containsKey(s2)){
                    mlen += (Math.min(map.get(s1),map.get(s2)))*4;
                    map.remove(s1);
                    map.remove(s2);
                }
            }
        }
        return mlen;
        

    }
}