// Last updated: 8/1/2025, 7:00:54 AM
class Solution {
    public String concatHex36(int n) {
        int n2 = n*n;
        int n3 = n2*n;
        String out = "";
        while (n2>0){
            int rem = n2%16;
            if (rem<=9){
                out = rem + out;
            }
            else{
                out = (char) (64+rem-9) + out;
            }
            n2 /= 16;
        }
        String out1 = "";
        while (n3>0){
            int rem = n3%36;
            if (rem<=9){
                out1 = rem + out1;
            }
            else{
                out1 = (char) (64+rem-9) + out1;
            }
            n3 /= 36;
        }
        return out+out1;
        
    }
}