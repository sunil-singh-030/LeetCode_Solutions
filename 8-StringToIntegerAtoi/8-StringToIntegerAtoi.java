// Last updated: 8/1/2025, 7:13:06 AM
class Solution {
    static boolean flagnum;
    static boolean flagsign;
    static int sign;
    static long res;
    public int myAtoi(String s) {
        flagnum = false;
        flagsign = false;
        sign = 1;
        res = 0;
        generate(s,0);
        if (sign==1){
            return (int) res;
        }
        else {
            if (res==Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            else{
                return (int) -res;
            }
        }
    }
    public static void generate(String s , int index){
        if (index==s.length()){
            return;
        }
        char ch = s.charAt(index);
        int ascii = (int) ch;
        if (ascii>=48 && ascii<=57){
            flagnum = true;
            res = res*10 + Integer.parseInt(s.substring(index,index+1));
        }
        else{
            if ( !flagnum &&  (ch=='+' || ch=='-' || ch==' ')){
                if (ch == '+' || ch == '-'){
                    if (!flagsign){
                        flagsign = true;
                        if (ch == '-'){
                            sign = -1;
                        }
                    }
                    else{
                        return;
                    }
                }
                else {
                    if (flagsign){
                        return;
                    }
                }
            }
            else{
                return;
            }
        }
        if (sign==1){
            if (res>Integer.MAX_VALUE){
                res = Integer.MAX_VALUE;
                return;
            }
        }
        else {
            if (res>Math.pow(2,31) ){
                res = Integer.MIN_VALUE;
                return;
            }
        }
        generate(s,index+1);
    }
}