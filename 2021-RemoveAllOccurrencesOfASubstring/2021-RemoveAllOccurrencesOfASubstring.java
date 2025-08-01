// Last updated: 8/1/2025, 7:04:32 AM
class Solution {
    public String removeOccurrences(String s, String part) {
        int n =part.length();
        int i=0;
        while(s.contains(part)){
            if(s.substring(i,i+n).equals(part)){
                s=s.substring(0,i)+s.substring(i+n);
                i=0;
            }
            else{
                i++;
            }
        }
        return s;
    }
}