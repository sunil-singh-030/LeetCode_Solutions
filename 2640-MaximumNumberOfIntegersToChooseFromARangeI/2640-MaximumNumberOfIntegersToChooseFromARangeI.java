// Last updated: 8/1/2025, 7:03:16 AM
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int c=0;
        int sum=0;
        int num=1;
        boolean [] ban=new boolean[n+1];
        for (int i:banned){
            if (i<=n){
                ban[i]=true;
            }
        }
        while (num<=n){
            if (ban[num]==false){
                sum+=num;
                if (sum<=maxSum){
                    c++;
                }
                else{
                    break;
                }
            }
            
            num++;
        }
        return c;
    }
}