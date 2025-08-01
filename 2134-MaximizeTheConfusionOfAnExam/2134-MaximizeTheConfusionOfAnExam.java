// Last updated: 8/1/2025, 7:04:22 AM
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(lets(answerKey,'T',k),lets(answerKey,'F',k));
    }
    public static int lets(String s , char target , int k){
        int mlen = 0;
        int chance = k;
        int si = 0;
        int ci = 0;
        int n = s.length();
        while (ci<n){
            char ch = s.charAt(ci);
            if (ch==target){
                if (chance>0){
                    chance--;
                }
                else{
                    mlen = Math.max(mlen,ci-si);
                    while (true){
                        if (s.charAt(si)==target){
                            si++;
                            break;
                        }
                        si++;
                    }
                }
            }
            ci++;
        }
        mlen = Math.max(mlen,ci-si);
        return mlen;
    }
}