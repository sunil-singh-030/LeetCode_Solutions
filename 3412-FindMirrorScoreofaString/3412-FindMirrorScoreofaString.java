// Last updated: 1/22/2026, 2:34:33 PM
class Solution {
    public long calculateScore(String s) {
        HashMap<Character,Stack<Integer>> map = new HashMap<>();
        long target = 0;

        for(int i = 0; i< s.length();i++){
            int dis = s.charAt(i)- 'a';
            char mirror = (char)('z' - dis);

            if(map.containsKey(mirror)&& !map.get(mirror).isEmpty()){
              target  += (i - map.get(mirror).pop());
            }else{
                map.computeIfAbsent(s.charAt(i),k -> new Stack<>()).push(i);
            }
        }
        return target;
        
    }
}