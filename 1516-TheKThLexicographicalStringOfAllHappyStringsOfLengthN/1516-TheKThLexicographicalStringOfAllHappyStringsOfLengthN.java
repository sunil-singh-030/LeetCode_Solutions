// Last updated: 8/1/2025, 7:05:30 AM
class Solution {
    static int cnt = 0;
    static boolean flag = false;
    static char[] arr = {'a','b','c'};
    static String ans = "";
    public String getHappyString(int n, int k) {
        ans = "";
        cnt = 0;
        flag = false;
        lets(n,k,"");
        return ans;
    }
    public static void lets(int n , int k , String s){
        if (flag){
            return;
        }
        if (n==0){
            cnt++;
            if (cnt==k){
                ans = s;
                flag = true;
            }
            return;
        }
        for (int i=0 ; i<3 ; i++){
            if (s.length()==0 || s.charAt(s.length()-1)!=arr[i]){
                lets(n-1,k,s+arr[i]);
            }
        }
    }
}