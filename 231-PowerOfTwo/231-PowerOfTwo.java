// Last updated: 8/1/2025, 7:09:48 AM
class Solution {
    static boolean flag=false;
    public boolean isPowerOfTwo(int n) {
        flag=false;
        if (n<0){
            return flag;
        }
        power(n,0);
        return flag;
    }
    public static void power(int n , int pow){
        if (n==(long) Math.pow(2,pow)){
            flag=true;
            return;
        }
        if (n<(long) Math.pow(2,pow)){
            return;
        }
        power(n,pow+1); 
    }
}