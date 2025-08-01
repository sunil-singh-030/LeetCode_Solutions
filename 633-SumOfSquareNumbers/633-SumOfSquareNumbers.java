// Last updated: 8/1/2025, 7:07:54 AM
class Solution {
    public boolean judgeSquareSum(int c) {
        long first = 0;
        long last = (long) Math.sqrt(c);

        while(first<=last){
            long ans = first*first + last*last;
            if(ans<c){
                first++;
            }
            else if(ans>c){
                last--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}