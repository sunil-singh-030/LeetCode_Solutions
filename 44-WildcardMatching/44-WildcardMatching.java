// Last updated: 8/1/2025, 7:12:25 AM
class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        if (n==0){
            for (char ch : p.toCharArray()){
                if (ch!='*'){
                    return false;
                }
            }
            return true;
        }
        if (m==0){
            return n==0 ? true : false;
        }
        boolean[] curr = new boolean[m+1];
        boolean[] prev = new boolean[m+1];
        prev[0] = true;
        for (int i=1 ; i<=m ; i++){
            if (p.charAt(i-1)!='*'){
                break;
            }
            prev[i] = true;
        }
        for (int i=1 ; i<=n ; i++){
            for (int j=0 ; j<=m ; j++){
                if (j==0){
                    curr[j] = false;
                    continue;
                }
                if (s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    if (prev[j-1]){
                        curr[j] = true;
                        continue;
                    }
                }
                else if (p.charAt(j-1)=='*'){
                    if (curr[j-1] || prev[j]){
                        curr[j] = true;
                        continue;
                    }
                }
                curr[j] = false;
            }
            prev = curr.clone();
        }
        return curr[m];
    }
}