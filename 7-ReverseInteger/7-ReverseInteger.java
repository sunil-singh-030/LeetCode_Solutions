// Last updated: 8/1/2025, 7:13:07 AM
class Solution {
    public int reverse(int x) {
        boolean flag=false;
        if(x<0){
            flag=true;
        }
        x=Math.abs(x);
        String sx=String.valueOf(x);
        int n=sx.length();
        long num=0;
        while (x>0){
            int digit=x%10;
            num+= (long) digit*Math.pow(10,n-1);
            x/=10;
            n--;
        }
        if (num>Math.pow(2,31)-1 | num<(0-Math.pow(2,31))){
            return 0;
        }
        else{
            if(flag){
            num=0-num;
            }
            return (int) num; 
        }
        
    }
}