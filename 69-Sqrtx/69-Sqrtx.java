// Last updated: 8/1/2025, 7:11:57 AM
class Solution {
    public int mySqrt(int x) {
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
        if (x==0){
            return 0;
        }
        else{
            return (int) out;
        }
        
    }
}