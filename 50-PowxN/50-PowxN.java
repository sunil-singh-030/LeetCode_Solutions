// Last updated: 8/1/2025, 7:12:16 AM
class Solution {
    public double myPow(double x, int n) {
        double result = power(x,Math.abs(n));
        if (n>=0){
            return result;
        }
        else {
            return 1/result;
        }
    }
    public static double power(double x , int n){
        if (n==0){
            return 1;
        }
        if (n==1){
            return x;
        }
        double result = power(x,n/2);
        if (n%2==0){
            return result*result;
        }
        else{
            return result*result*x;
        }
    }
    
}