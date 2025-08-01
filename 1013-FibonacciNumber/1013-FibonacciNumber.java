// Last updated: 8/1/2025, 7:06:26 AM
class Solution {
    public int fib(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int a=0;
        int b=1;
        for (int i=2;i<=n;i++){
            int temp=a;
            a=b;
            b=temp+b;
            
        }
        return b;
    }
}