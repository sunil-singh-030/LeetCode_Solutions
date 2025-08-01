// Last updated: 8/1/2025, 7:05:51 AM
class Solution {
    public int minimumSwap(String s1, String s2) {
        int cntxy = 0;
        int cntyx = 0;
        for (int i=0 ; i<s1.length() ; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (ch1==ch2){
                continue;
            }
            else {
                if (ch1=='x'){
                    cntxy++;
                }
                else{
                    cntyx++;
                }
            }
        }
        int cnt = 0;
        cnt += cntxy/2;
        cntxy = cntxy%2;
        cnt += cntyx/2;
        cntyx = cntyx%2;
        if (cntxy==cntyx){
            if (cntxy==0){
                return cnt;
            }
            else{
                return cnt+2;
            }
        }
        else{
            return -1;
        }
    }
}