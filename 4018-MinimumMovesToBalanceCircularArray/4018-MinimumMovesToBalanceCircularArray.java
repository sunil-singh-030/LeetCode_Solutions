// Last updated: 12/19/2025, 11:54:29 AM
class Solution {
    public long minMoves(int[] balance) {
        int n = balance.length;
        long tsum = 0;
        int negIdx = -1;
        for (int i=0 ; i<n ; i++){
            tsum += balance[i];
            if (balance[i]<0){
                negIdx = i;
            }
        }
        if (tsum<0) return -1;
        if (negIdx==-1) return 0;
        int req = Math.abs(balance[negIdx]);
        int left = negIdx-1;
        long dis = 1;
        int right = negIdx+1;
        long move = 0;
        while (req>0){
            if (left<0){
                left += n;
            }
            left %= n;
            right %= n;
            if (balance[left]>0){
                long take = (long) Math.min(req,balance[left]);
                move += (take*dis);
                req -= take;
            }
            if (req==0) break;
            if (balance[right]>0){
                long take = (long) Math.min(req,balance[right]);
                move += (take*dis);
                req -= take;
            }
            dis++;
            left--;
            right++;

        }
        return move;

    }
}