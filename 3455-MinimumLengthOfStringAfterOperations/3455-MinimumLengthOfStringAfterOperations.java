// Last updated: 8/1/2025, 7:02:21 AM
class Solution {
    public int minimumLength(String s) {
        int [] arr = new int[26];
        for (char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int length=0;
        for (int count :arr){
            if (count>0){
                if (count%2==0){
                    length+=2;
                }
                else{
                    length++;
                }
            }
            
            
        }
        return length;
    }
}