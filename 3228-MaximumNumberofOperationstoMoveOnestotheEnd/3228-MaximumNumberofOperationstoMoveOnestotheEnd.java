// Last updated: 11/13/2025, 9:59:43 AM
class Solution {
    public int maxOperations(String s) {
        int n = s.length();
        int cntOp = 0;
        int cnt1 = 0;
        boolean flag = false;
        for (int i=0 ; i<n ; i++){
            if (s.charAt(i)=='1'){
                if (flag){
                    cntOp += cnt1;
                    flag = false;
                }
                cnt1++;
            }
            else{
                flag = true;
            }
        }
        if (flag){
            cntOp += cnt1;
            flag = false;
        }
        return cntOp;
    }
}