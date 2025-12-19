// Last updated: 12/19/2025, 11:54:19 AM
class Solution {
    public int totalWaviness(int num1, int num2) {
        int cnt = 0;
        if (num1<100){
            num1 = 100;
        }
        while (num1<=num2){
            String s = String.valueOf(num1);
            int len = s.length();
            for (int i=1 ; i<len-1 ; i++){
                int l = s.charAt(i-1)-'0';
                int m = s.charAt(i)-'0';
                int r = s.charAt(i+1)-'0';
                if ((m>l && m>r) || (l>m && r>m)){
                    cnt++;
                }
            }
            num1++;
        }
        return cnt;
    }
}