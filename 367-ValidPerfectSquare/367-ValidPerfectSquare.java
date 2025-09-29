// Last updated: 9/29/2025, 6:33:14 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        int x=num;
        long lo=1;
        long hi=x;
        long out=1;
        while (lo<=hi){
            long mid=(lo+hi)/2;
            if (Math.pow(mid,2)<=x){
                out=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        //System.out.println(out);
        return ((int) Math.pow(out,2))==x;
    }
}