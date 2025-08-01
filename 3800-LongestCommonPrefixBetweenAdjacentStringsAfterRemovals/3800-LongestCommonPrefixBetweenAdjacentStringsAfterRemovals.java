// Last updated: 8/1/2025, 7:01:19 AM
class Solution {
    public int[] longestCommonPrefix(String[] words) {
        int n = words.length;
        int[] lmax = new int[n];
        int max = 0;
        for (int i=1 ; i<n ; i++){
            lmax[i] = max;
            String s1 = words[i];
            String s2 = words[i-1];
            int cnt = 0;
            int ind1 = 0;
            int ind2 = 0;
            while (ind1<s1.length() && ind2<s2.length() && s1.charAt(ind1)==s2.charAt(ind2)){
                cnt++;
                ind1++;
                ind2++;
            }
            max = Math.max(cnt,max);
        }
        //System.out.println(Arrays.toString(lmax));
        int[] rmax = new int[n];
        max = 0;
        for (int i=n-2 ; i>=0 ; i--){
            rmax[i] = max;
            String s1 = words[i];
            String s2 = words[i+1];
            int cnt = 0;
            int ind1 = 0;
            int ind2 = 0;
            while (ind1<s1.length() && ind2<s2.length() && s1.charAt(ind1)==s2.charAt(ind2)){
                cnt++;
                ind1++;
                ind2++;
            }
            max = Math.max(cnt,max);
        }
        int[] ans = new int[n];
        for (int i=0 ; i<n ; i++){
            ans[i] = Math.max(lmax[i],rmax[i]);
            if (i!=0 && i!=n-1){
                String s1 = words[i-1];
                String s2 = words[i+1];
                int cnt = 0;
            int ind1 = 0;
            int ind2 = 0;
            while (ind1<s1.length() && ind2<s2.length() && s1.charAt(ind1)==s2.charAt(ind2)){
                cnt++;
                ind1++;
                ind2++;
            }
            ans[i] = Math.max(cnt,ans[i]);
            }
        }
        return ans;
    }
}