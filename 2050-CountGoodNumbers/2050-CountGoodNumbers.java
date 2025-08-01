// Last updated: 8/1/2025, 7:04:29 AM
class Solution {
    static int modulo = 1000000007;
    public int countGoodNumbers(long n) {
        if (n%2==0){
            int result = (int) ((power(5,n/2)*power(4,n/2))%modulo);
            return result;
        }
        else{
            int result = (int) ((power(5,(n/2)+1)*power(4,n/2))%modulo);
            return result;
        }
    }
    public static long power (int num ,long n){
        if (n==0){
            return 1;
        }
        if (n==1){
            return num;
        }
        long ans = power(num,n/2)%modulo;
        if (n%2==0){
            return (ans*ans)%modulo;
        }
        else{
            return (ans*ans*num)%modulo;
        }
    }
}