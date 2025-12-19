// Last updated: 12/19/2025, 11:58:05 AM
class Solution {
    public int countSubstrings(String s, String t) {
        int cnt = 0;
        for (int i=0 ; i<s.length() ; i++){
            String str = "";
            for (int j=i ; j<s.length() ; j++){
                str += s.charAt(j);
                int res = isvalid(str,t);
                if (res>0){
                    cnt += res;
                }
            }
        }
        return cnt;
    }
    
    public static int isvalid(String str, String t){
        int count = 0;
        int len = str.length();
        String curr = "";
        for (int i=0 ; i<len ; i++){
            curr += t.charAt(i);
        }
        int c = 0;
        for (int i=0 ; i<len ; i++){
            if (str.charAt(i)!=curr.charAt(i)){
                c++;
            }
            if (c>1){
                break;
            }
        }
        if (c==1){
            count++;
        }
        for (int i=len ; i<t.length() ; i++){
            curr = curr.substring(1);
            curr += t.charAt(i);
            c = 0;
            for (int j=0 ; j<len ; j++){
                if (str.charAt(j)!=curr.charAt(j)){
                    c++;
                }
                if (c>1){
                    break;
                }
            }
            if (c==1){
                count++;
            }
        }
        return count;
    }
}