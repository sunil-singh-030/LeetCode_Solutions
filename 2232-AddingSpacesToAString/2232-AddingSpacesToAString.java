// Last updated: 8/1/2025, 7:04:05 AM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder out=new StringBuilder();
        int ind=0;
        for (int i=0;i<spaces.length;i++){
            out.append(s.substring(ind,spaces[i]));
            out.append(" ");
            ind=spaces[i];
        }
        out.append(s.substring(ind,s.length()));
        return out.toString();
    }
}