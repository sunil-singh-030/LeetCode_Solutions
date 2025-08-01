// Last updated: 8/1/2025, 7:06:51 AM
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map = new HashMap<>();
        String s = "";
        for (char ch : s1.toCharArray()){
            if (ch==' '){
                if (s.length()>0){
                    map.put(s,map.getOrDefault(s,0)+1);
                }
                s = "";
            }
            else{
                s += ch;
            }
        }
        if (s.length()>0){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        Map<String,Integer> map1 = new HashMap<>();
        String ss = "";
        for (char ch : s2.toCharArray()){
            if (ch==' '){
                if (ss.length()>0){
                    map1.put(ss,map1.getOrDefault(ss,0)+1);
                }
                ss = "";
            }
            else{
                ss += ch;
            }
        }
        if (ss.length()>0){
            map1.put(ss,map1.getOrDefault(ss,0)+1);
        }
        //System.out.println(map+" "+map1);
        int c = 0;
        List<String> ls  = new ArrayList<>();
        for (String str : map.keySet()){
            if (map1.getOrDefault(str,0)==0 && map.get(str)==1){
                ls.add(str);
                c++;
            }
        }
        for (String str : map1.keySet()){
            if (map.getOrDefault(str,0)==0 && map1.get(str)==1){
                ls.add(str);
                c++;
            }
        }
        String[] arr = new String[c];
        for (int i=0 ; i<c ; i++){
            arr[i] = ls.get(i);
        }
        return arr;
    }
}