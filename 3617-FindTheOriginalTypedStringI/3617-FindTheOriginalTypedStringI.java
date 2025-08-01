// Last updated: 8/1/2025, 7:02:08 AM
class Solution {
    public int possibleStringCount(String word) {
        int cnt = 1;
        int n = word.length();
        char prevch = word.charAt(0);
        for (int i=1 ; i<n ; i++){
            char currch = word.charAt(i);
            if (prevch==currch){
                cnt++;
            }
            else{
                prevch = currch;
            }
        }
        return cnt;
    }
}