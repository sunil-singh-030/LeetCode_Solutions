// Last updated: 8/1/2025, 7:08:01 AM
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length()<s1.length()){
            return false;
        }
        int [] arr1=new int[26];
        for (char ch:s1.toCharArray()){
            arr1[ch-'a']++;
        }
        int [] arr2=new int[26];
        for (int i=0;i<s1.length();i++){
            arr2[s2.charAt(i)-'a']++;
        }
        if (Arrays.equals(arr1,arr2)){
            return true;
        }
        for (int i=s1.length();i<s2.length();i++){
            arr2[s2.charAt(i)-'a']++;
            arr2[s2.charAt(i-s1.length())-'a']--;
            if (Arrays.equals(arr1,arr2)){
                return true;
            }
        }
        return false;
    }
}