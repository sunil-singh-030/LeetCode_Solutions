// Last updated: 12/19/2025, 11:53:56 AM
class Solution {
    public long sumAndMultiply(int n) {
        String s = "";
        long ans2 = 0;
        while (n>0){
            int rem = n%10;
            if (rem!=0){
                s = rem + s;
                ans2 += rem;
            }
            
            n /= 10;
        }
        if (s.length()==0){
            return 0;
        }
        return ((long)Integer.valueOf(s))*ans2;
    }
}