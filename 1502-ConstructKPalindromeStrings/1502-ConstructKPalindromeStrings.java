// Last updated: 8/1/2025, 7:05:33 AM
class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length()<k){
            return false;
        }
        if (s.length()==k){
            return true;
        }
        int [] arr=new int[26];
        for (char chr : s.toCharArray()) {
            arr[chr - 'a']++;
        }
        int count=0;
        for (int num:arr){
            if (num%2!=0){
                count++;
            }
        }
        return count<=k;
    }
}