// Last updated: 11/22/2025, 8:02:20 PM
class Solution {
    public int minimumFlips(int n) {
        String s = "";
        while (n>0){
            s += n%2;
            n /= 2;
        }
        int cnt = 0;
        int len = s.length();
        for (int i=0 ; i<len/2 ; i++){
            if (s.charAt(i)!=s.charAt(len-1-i)){
                cnt += 2;
            }
        }
        return cnt;
    }
}