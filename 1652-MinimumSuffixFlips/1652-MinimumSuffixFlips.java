// Last updated: 8/1/2025, 7:05:04 AM
class Solution {
    public int minFlips(String target) {
        int n = target.length();
        int cnt = 0;
        char curr = '0';
        for (char ch : target.toCharArray()){
            if (ch==curr){
                continue;
            }
            else{
                cnt++;
                curr = ch;
            }
        }
        return cnt;
    }
}