// Last updated: 8/1/2025, 7:06:14 AM
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans=Integer.MIN_VALUE;
        int [] rmax=new int[values.length];
        int max=-100000;
        rmax[values.length-1]=max;
        for (int i=values.length-2;i>=0;i--){
            max--;
            if (values[i+1]>max){
                max=values[i+1];
            }
            rmax[i]=max-1;
            ans=Math.max(ans,values[i]+rmax[i]);
        }
        return ans;
    }
}