// Last updated: 8/1/2025, 7:08:40 AM
class Solution {
    public int characterReplacement(String s, int k) {
        int [] arr=new int[26];
        for (int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
        }
        int ans=1;
        for (int i=0;i<26;i++){
            if (arr[i]>0){
                //System.out.println((char) (i+65));
                int out=countsamelenstr(s,k,(char) (i+65));
                ans=Math.max(ans,out);
                //System.out.println(ans);
            }
        }
        return ans;
    }
    public static int countsamelenstr(String s,int k,char ch){
        int ans=1;
        int si=0;
        int ci=0;
        int flip=0;
        while (ci<s.length()){
            // grow
            if (s.charAt(ci)!=ch){
                flip++;
            }
            // shrink
            while (flip>k){
                if (s.charAt(si)!=ch){
                    flip--;
                }
                si++;
            }
            // ans update
            ans=Math.max(ans,ci-si+1);
            ci++;
        }
        return ans;
    }
}