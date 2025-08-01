// Last updated: 8/1/2025, 7:05:28 AM
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> s=new ArrayList<String>();
        for (int i=0;i<words.length;i++){
            for (int j=0;j<words.length;j++){
                if (i!=j && words[j].contains(words[i])){
                    s.add(words[i]);
                    break;
                }
            }
        }
        return s;
    }
}