// Last updated: 8/1/2025, 7:03:06 AM
class Solution {
    public int minMaxDifference(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int min = 0;
        int digit = arr[0]-'0';
        for (char ch : arr){
            if (ch-'0'==digit){
                min *= 10;
            }
            else{
                min = min*10 + (ch-'0');
            }
        }
        int max = 0;
        digit = -1;
        for (char ch : arr){
            int dig = ch-'0';
            if (dig!=9 && digit==-1){
                digit = dig;
            }
            if (digit!=-1){
                if (dig==digit){
                    max = max*10 + 9;
                }
                else{
                    max = max*10 + dig;
                }
            }
            else{
                max = max*10 + 9;
            }
        }
        return max-min;
    }
}