// Last updated: 10/1/2025, 10:45:12 AM
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] ans = new int[n];
        Arrays.fill(ans,1);
        for (int i=1 ; i<n ; i++){
            if (ratings[i]>ratings[i-1]){
                if (ans[i]>ans[i-1]){
                    continue;
                }
                else{
                    ans[i] = Math.max(ans[i],ans[i-1])+1;
                }
            }
        }
        //System.out.println(Arrays.toString(ans));
        for (int i=n-2 ; i>=0 ; i--){
            if (ratings[i]>ratings[i+1]){
                if (ans[i]>ans[i+1]){
                    continue;
                }
                else{
                    ans[i] = Math.max(ans[i],ans[i+1])+1;
                }
            }
        }
        //System.out.println(Arrays.toString(ans));
        int cnt = 0;
        for (int candy : ans){
            cnt += candy;
        }
        return cnt;
    }
}