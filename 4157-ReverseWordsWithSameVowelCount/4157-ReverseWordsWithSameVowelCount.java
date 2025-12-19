// Last updated: 12/19/2025, 11:53:52 AM
class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int cnt = 0;
        for (int i=0 ; i<arr[0].length() ; i++){
            char ch = arr[0].charAt(i);
            if (set.contains(ch)){
                cnt++;
            }
        }
        for (int i=1 ; i<arr.length ; i++){
            int cnt1 = 0;
            for (int j=0 ; j<arr[i].length() ; j++){
                char ch = arr[i].charAt(j);
                if (set.contains(ch)){
                    cnt1++;
                }
            }
            if (cnt1==cnt){
                String news = "";
                for (int j=0 ; j<arr[i].length() ; j++){
                    char ch = arr[i].charAt(j);
                    news = ch + news;
                }
                arr[i] = news;
            }
            
        }
        String out = "";
        for (String s1 : arr){
            out += s1;
            out += " ";
        }
        return out.substring(0,out.length()-1);
    }
}