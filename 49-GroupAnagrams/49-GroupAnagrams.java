// Last updated: 8/1/2025, 7:12:18 AM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ls = new ArrayList<>();
        HashMap<String,Integer> map1 = new HashMap<>();
        for (String str : strs){
            int[] freq = new int[26];
            for (char ch : str.toCharArray()){
                freq[ch-'a']++;
            }
            String news = "";
            for (int i=0 ; i<26 ; i++){
                news += String.valueOf((char) (97+i)).repeat(freq[i]);
            }
            if (map1.containsKey(news)){
                List<String> ls1 = ls.get(map1.get(news));
                ls1.add(str);
                ls.set(map1.get(news),ls1);
            }
            else{
                int ind = ls.size()+1;
                List<String> ls1 = new ArrayList<>();
                ls1.add(str);
                ls.add(ls1);
                map1.put(news,ind-1);
            }
        }
        return ls;
    }
}