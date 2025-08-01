// Last updated: 8/1/2025, 7:01:36 AM
class Solution {
    public int maxDifference(String s) {
        int [] arr = new int[26];
        for (char ch : s.toCharArray()){
            arr[ch-'a']++;
        }
        int odd = Integer.MIN_VALUE;
        int even = Integer.MAX_VALUE;
        for (int i=0 ; i<26 ; i++){
            if (arr[i]%2==0 && arr[i]>0){
                even = Math.min(even,arr[i]);
            }
            else{
                odd = Math.max(odd,arr[i]);
            }
        }
        return odd-even;
    }
}