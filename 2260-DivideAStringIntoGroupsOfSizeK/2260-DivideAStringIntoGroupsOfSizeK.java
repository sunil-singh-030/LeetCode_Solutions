// Last updated: 8/1/2025, 7:04:01 AM
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length()/k;
        if (s.length()%k!=0){
            len++;
        }
        String[] ans = new String[len];
        int ind = 0;
        for (int i=0 ; i<ans.length ; i++){
            int lastind = ind+k;
            if (lastind<=s.length()){
                ans[i] = s.substring(ind,lastind);
                ind = lastind;
            }
            else{
                String add = s.substring(ind);
                int req = k-add.length();
                add += String.valueOf(fill).repeat(req);
                ans[i] =  add;
                ind = lastind;
            }
        }
        return ans;
    }
}