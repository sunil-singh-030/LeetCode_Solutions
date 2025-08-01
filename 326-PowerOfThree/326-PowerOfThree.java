// Last updated: 8/1/2025, 7:09:14 AM
class Solution {
    static boolean flag;
    public boolean isPowerOfThree(int n) {
        flag=false;
        if (n<=0 || n%2==0 || (n%3!=0 && n>1)){
            return flag;
        }
        power(n,0);
        return flag;
    }
    public static void power(int n , int pow){
        if (n==(long) Math.pow(3,pow)){
            flag=true;
            return;
        }
        if (n<(long) Math.pow(3,pow)){
            return;
        }
        power(n,pow+1); 
    }
}