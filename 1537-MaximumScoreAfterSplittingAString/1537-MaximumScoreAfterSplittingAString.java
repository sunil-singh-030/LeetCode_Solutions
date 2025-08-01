// Last updated: 8/1/2025, 7:05:26 AM
class Solution {
    public int maxScore(String s) {
        int [] lmax=new int[s.length()];
        int add=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='0'){
                add++;
            }
            lmax[i]=add;
        }
        int max=0;
        add=0;
        if (s.charAt(s.length()-1)=='1'){
                add++;
        }
        for (int i=s.length()-2;i>=0;i--){
            max=Math.max(lmax[i]+add,max);
            if (s.charAt(i)=='1'){
                add++;
            }
        }
        return max;
    }
}