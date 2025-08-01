// Last updated: 8/1/2025, 7:01:51 AM
class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i=0 ; i<responses.size() ; i++){
            HashSet<String> set = new HashSet<>();
            for (int j=0 ; j<responses.get(i).size() ; j++){
                if (!set.contains(responses.get(i).get(j))){
                    String s = responses.get(i).get(j);
                    set.add(s);
                    map.put(s,map.getOrDefault(s,0)+1);
                }
            }
        }
        String out = "";
        int cnt = 0;
        for (String key : map.keySet()){
            if (map.get(key)>cnt){
                out = key;
                cnt = map.get(key);
                continue;
            }
            if (map.get(key)==cnt && out.compareTo(key)>0){
                out = key;
                cnt = map.get(key);
            }
        }
        return out;
    }
}