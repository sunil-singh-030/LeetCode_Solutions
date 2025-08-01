// Last updated: 8/1/2025, 7:07:33 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans=letters[0];
        int left=0;
        int right=letters.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (target<letters[mid]){
                right=mid-1;
                ans=letters[mid];
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}