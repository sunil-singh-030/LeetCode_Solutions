// Last updated: 8/1/2025, 7:00:56 AM
class Solution {
    public List<String> partitionString(String s) {
        List<String> ls = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        String str = "";
        str += s.charAt(0);
        int n = s.length();
        for (int i=1 ; i<n ; i++){
            if (map.containsKey(str)){
                str += s.charAt(i);
            }
            else{
                ls.add(str);
                map.put(str,0);
                str = "";
                str += s.charAt(i);
            }
        }
        if (str.length()>0){
            if (!map.containsKey(str)){
                ls.add(str);
            }
        }
        return ls;
    }
}