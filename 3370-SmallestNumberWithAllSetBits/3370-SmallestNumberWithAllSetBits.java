// Last updated: 10/29/2025, 9:27:29 AM
class Solution {
    public int smallestNumber(int n) {
        int ans=n;
        boolean flag=true;
        while (flag){
            String s=binary(n);
            if (s.contains("0")==false){
                ans=n;
                flag=false;
            }
            n++;
        }
        return ans;
    }
    public static String  binary(int n){
        String out="";
        while (n>=2){
            out= n%2 +out;
            n/=2;
        }
        out= n +out;
        return out;
    }
}