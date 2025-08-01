// Last updated: 8/1/2025, 7:08:34 AM
class Solution {
    public int arrangeCoins(int n) {
        long left=1;
        long right=Integer.MAX_VALUE;
        long ans=1;
        while (left<=right){
            long mid=(left+right)/2;
            long sum= (long) mid*(mid+1)/2;
            if (sum>n){
                right=mid-1;
            }
            else {
                ans=mid;
                left=mid+1;
            }
        }
        return (int) ans;
    }
}