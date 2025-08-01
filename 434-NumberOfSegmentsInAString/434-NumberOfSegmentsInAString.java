// Last updated: 8/1/2025, 7:08:38 AM
class Solution {
    public int countSegments(String s) {
        if (s.length()==0){
            return 0;
        }
        if (s.length()==1){
            if (s.charAt(0)==' '){
                return 0;
            }
            else{
                return 1;
            }
        }
        int c=0;
        for (int i=0;i<s.length()-1;i++){
            // System.out.println(s.charAt(i)!=' ');
            // System.out.println(s.charAt(i)==' ');
            if (s.charAt(i)!=' ' && s.charAt(i+1)==' '){
                c++;
            }
        }
        if (s.charAt(s.length()-1)!=' '){
            c++;
        }
        return c;
    }
}