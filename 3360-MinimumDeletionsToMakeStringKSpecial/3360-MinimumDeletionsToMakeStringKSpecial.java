// Last updated: 8/1/2025, 7:02:31 AM
class Solution {
    public int minimumDeletions(String word, int k) {
        int[] freq = new int[26];
        for (char ch : word.toCharArray()){
            freq[ch-'a']++;
        }
        List<Integer> ls = new ArrayList<>();
        for (int n : freq){
            if (n>0){
                ls.add(n);
            }
        }
        Collections.sort(ls);
        //System.out.println(ls);
        int ans = Integer.MAX_VALUE;
        for (int i=0 ; i<ls.size() ; i++){
            int cnt = 0;
            int num = ls.get(i);
            for (int j=0 ; j<ls.size() ; j++){
                int cur = ls.get(j);
                if (cur<num){
                    cnt += cur;
                }
                else if (cur-num>k){
                    cnt += cur - (num+k);
                }
            }
            ans = Math.min(ans,cnt);
            //System.out.println(cnt);
        }
        return ans;
        
    }
}