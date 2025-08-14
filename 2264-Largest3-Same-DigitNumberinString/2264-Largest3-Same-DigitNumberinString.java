// Last updated: 8/14/2025, 11:21:05 AM
class Solution {
    public String largestGoodInteger(String num) {
        char chr = '_';
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0 ; i<3 ; i++){
            char ch = num.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if (map.size()==1){
            for (char ch : map.keySet()){
                chr = ch;
            }
        }
        for (int i=3 ; i<num.length() ; i++){
            char ch = num.charAt(i);
            char prevch = num.charAt(i-3);
            map.put(ch,map.getOrDefault(ch,0)+1);
            int prevcnt = map.get(prevch);
            if (prevcnt==1){
                map.remove(prevch);
            }
            else{
                map.put(prevch,prevcnt-1);
            }
            if (map.size()==1){
                for (char ch1 : map.keySet()){
                    if (chr=='_'){
                        chr = ch1;
                        continue;
                    }
                    if (ch1-'0'>chr-'0'){
                        chr = ch1;
                    }
                }
            }

            
        }
        if (chr=='_'){
            return "";
        }
        return ""+chr+chr+chr;
    }
}