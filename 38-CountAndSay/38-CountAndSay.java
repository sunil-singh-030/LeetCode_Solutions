// Last updated: 8/1/2025, 7:12:33 AM
class Solution {
    public String countAndSay(int n) {
        if (n==1){
            return "1";
        }
        int cnt = 1;
        StringBuilder s = new StringBuilder("1");
        while (cnt<n){
            StringBuilder ns = new StringBuilder();
            int c = 1;
            Character curr = s.charAt(0);
            for (int i=1 ; i<s.length() ; i++){
                if (s.charAt(i)==curr){
                    c++;
                }
                else{
                    ns.append(c);
                    ns.append(curr);
                    c = 1;
                    curr = s.charAt(i);
                }
            }
            ns.append(c);
            ns.append(curr);
            s = ns;
            cnt++;
        }
        return s.toString();
    }
}