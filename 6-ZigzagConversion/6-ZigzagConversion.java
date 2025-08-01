// Last updated: 8/1/2025, 7:13:09 AM
class Solution {
    public String convert(String s, int numRows) {
        List<List<Character>> ls = new ArrayList<>();
        for (int i=0 ; i<numRows ; i++){
            ls.add(new ArrayList<>());
        }
        int index = 0;
        while (index<s.length()){
            for (int i=0 ; i<numRows && index<s.length() ; i++){
                ls.get(i).add(s.charAt(index));
                index++;
            }
            for (int i = numRows-2 ; i>=1 && index<s.length() ; i--){
                ls.get(i).add(s.charAt(index));
                index++;
            }
        }
        String ans = "";
        for (int i=0 ; i<ls.size() ; i++){
            for (int j=0 ; j<ls.get(i).size() ; j++){
                ans += ls.get(i).get(j);
            }
        }
        return ans;
    }
}