// Last updated: 8/1/2025, 7:01:34 AM
class Solution {
    public int maxDistance(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('N',0);
        map.put('S',0);
        map.put('W',0);
        map.put('E',0);
        int ans = 0;
        for (char ch : s.toCharArray()){
            map.put(ch,map.get(ch)+1);
            int d1 = Math.abs(map.get('N')-map.get('S'));
            int d2 = Math.abs(map.get('W')-map.get('E'));
            int s1 = Math.min(map.get('N'),map.get('S'));
            int s2 = Math.min(map.get('W'),map.get('E'));
            int temp = (d1+d2)+(2*Math.min(s1+s2,k));
            ans = Math.max(ans,temp);
        }
        return ans;
    }
}