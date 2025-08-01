// Last updated: 8/1/2025, 7:13:04 AM
class Solution {
    public boolean isPalindrome(int x) {
        long num1= (long) x;
        String sx=String.valueOf(x);
        int n=sx.length();
        long num2=0;
        while (x>0){
            int digit=x%10;
            num2+=(long) digit*Math.pow(10,n-1);
            x/=10;
            n--;
        }
        if (num1==num2){
            return true;
        }
        else{
            return false;
        }
    }
}