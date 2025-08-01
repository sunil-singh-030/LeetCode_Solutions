// Last updated: 8/1/2025, 7:01:09 AM
class Solution {
    public int maxProduct(int n) {
        int[] flag = new int[10];
        while (n>0){
            int digit = n%10;
            flag[digit]++;
            n /= 10;
        }
        int ans = -1;
        boolean flag1 = true;
        for (int i=9 ; i>=0 ; i--){
            if (flag[i]>0){
                if (!flag1){
                    return ans*i;
                }
                ans = i;
                flag1 = false;
                if (flag[i]>1){
                    return i*i;
                }
            }
        }
        return 0;
    }
}