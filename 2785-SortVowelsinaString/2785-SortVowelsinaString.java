// Last updated: 9/11/2025, 7:29:46 AM
class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        char[] strArr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        char[] arr = {'a','e','i','o','u','A','E','I','O','U'};
        for (char ch : arr){
            set.add(ch);
        }
        HashSet<Integer> indSet = new HashSet<>();
        List<Character> ls = new ArrayList<>();
        for (int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            if (set.contains(ch)){
                indSet.add(i);
                ls.add(ch);
            }
        }
        Collections.sort(ls);
        int ind = 0;
        for (int i=0 ; i<n ; i++){
            if (indSet.contains(i)){
                strArr[i] = ls.get(ind);
                ind++;
            }
        }
        String ans = "";
        for (char ch : strArr){
            ans += ch;
        }
        return ans;
    }
}