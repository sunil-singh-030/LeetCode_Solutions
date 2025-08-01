// Last updated: 8/1/2025, 7:02:51 AM
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        for (int i=low ; i<=high  ; i++){
            if (String.valueOf(i).length()%2==1){
                i = ((int) Math.pow(10,String.valueOf(i).length())-1);
                continue;
            }
            int move = String.valueOf(i).length()/2; 
            int sum1 = 0;
            int sum2 = 0;
            int temp = i;
            while (temp>0){
                int digit = temp%10;
                if (move>0){
                    sum1 += digit;
                    move--;
                }
                else{
                    sum2 += digit;
                }
                temp /= 10;
            }
            if (sum1==sum2){
                cnt++;
            }
        }
        return cnt;
    }
}