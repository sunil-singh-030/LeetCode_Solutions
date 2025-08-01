// Last updated: 8/1/2025, 7:02:16 AM
class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int cnt = 0;
        int n = colors.length;
        int score = 0;
        for (int i=1 ; i<k ; i++){
            if (colors[i]!=colors[i-1]){
                score++;
            }
        }
        if (score==k-1){
            cnt++;
        }
        for (int i=k ; i<n+k-1 ; i++){
            if (colors[i%n]!=colors[(i-1)%n]){
                score++;
            }
            if (colors[(i-k)%n]!=colors[(i-k+1)%n]){
                score--;
            }
            if (score==k-1){
                cnt++;
            }
        }
        return cnt;
    }
}