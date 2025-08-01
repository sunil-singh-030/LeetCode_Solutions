// Last updated: 8/1/2025, 7:13:01 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String out="";
        for (int i=0;i<strs[0].length();i++){
            String str=strs[0].substring(0,i+1);
            boolean flag=true;
            for (int j=1;j<strs.length;j++){
                if (!strs[j].contains(str) || strs[j].indexOf(str)!=0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                out=str;
            }
        }
        return out;
    }
}