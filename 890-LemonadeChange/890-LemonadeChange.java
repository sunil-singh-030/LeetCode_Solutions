// Last updated: 8/1/2025, 7:07:03 AM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] freq = new int[3];
        for (int bill : bills){
            int change = bill-5;
            if (change==15){
                if (freq[1]>0){
                    freq[1]--;
                    change = 5;
                }
                int req = change/5;
                if (freq[0]>=req){
                    freq[0] -= req;
                }
                else{
                    return false;
                }
                freq[2]++;
            }
            else if (change==5){
                if (freq[0]>0){
                    freq[0]--;
                }
                else{
                    return false;
                }
                freq[1]++;
            }
            else{
                freq[0]++;
            }
        }
        return true;
    }
}