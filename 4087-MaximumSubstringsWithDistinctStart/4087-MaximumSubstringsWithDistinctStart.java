// Last updated: 12/19/2025, 11:54:10 AM
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()){
            set.add(ch);
        }
        return set.size();
    }
}