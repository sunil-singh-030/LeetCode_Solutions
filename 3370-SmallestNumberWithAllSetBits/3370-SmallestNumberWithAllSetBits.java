// Last updated: 10/29/2025, 9:32:40 AM
class Solution {
    public int smallestNumber(int n) {
        int left = 0;
        int right = 31;
        int ans = n;
        while (left<=right){
            int mid = (left+right)/2;
            int currNum = ((int) Math.pow(2,mid))-1;
            if (currNum==n){
                return n;
            }
            else if (currNum>n){
                ans = currNum;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
}