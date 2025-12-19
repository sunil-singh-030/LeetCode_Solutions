// Last updated: 12/19/2025, 11:54:05 AM
class Solution {
    public boolean completePrime(int num) {
        if (num==1){
            return false;
        }
        String s = String.valueOf(num);
        int n = s.length();
        for (int i=0 ; i<n ; i++){
            int nn = Integer.valueOf(s.substring(0,i+1));
            if (nn==1){
                return false;
            }
            if (!isprime(nn)){
                return false;
            }
        }
        for (int i=n-1 ; i>=0 ; i--){
            int nn = Integer.valueOf(s.substring(i,n));
            if (nn==1){
                return false;
            }
            if (!isprime(nn)){
                return false;
            }
        }
        return true;
    }
    public static boolean isprime(int n){
        for (int i=2 ; i<n ; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}