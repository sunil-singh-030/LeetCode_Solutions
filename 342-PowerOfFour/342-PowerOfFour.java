// Last updated: 8/1/2025, 7:09:10 AM
class Solution {
    static boolean flag;
    public boolean isPowerOfFour(int n) {
        flag=false;
        if (n==1){
            return true;
        }
        if (n<=0 || n%2==1 || (n%4!=0 && n>1)){
            return flag;
        }
        power(n,0);
        return flag;
    }
    public static void power(int n , int pow){
        if (n==(long) Math.pow(4,pow)){
            flag=true;
            return;
        }
        if (n<(long) Math.pow(4,pow)){
            return;
        }
        power(n,pow+1); 
    }
}