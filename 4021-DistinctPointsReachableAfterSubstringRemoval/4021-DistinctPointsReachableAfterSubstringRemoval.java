// Last updated: 12/19/2025, 11:54:27 AM
class Solution {
    public int distinctPoints(String s, int k) {
        HashSet<String> set = new HashSet<>();
        int cntu = 0;
        int cntd = 0;
        int cntl = 0;
        int cntr = 0;
        for (char ch : s.toCharArray()){
            if (ch=='U'){
                cntu++;
            }
            else if (ch=='D'){
                cntd++;
            }
            else if (ch=='L'){
                cntl++;
            }
            else{
                cntr++;
            }
        }
        int cntu1 = 0;
        int cntd1 = 0;
        int cntl1 = 0;
        int cntr1 = 0;
        for (int i=0 ; i<k ; i++){
            char ch = s.charAt(i);
            if (ch=='U'){
                cntu1++;
            }
            else if (ch=='D'){
                cntd1++;
            }
            else if (ch=='L'){
                cntl1++;
            }
            else{
                cntr1++;
            }
        }
        int ans = 0;
        String curr = "";
        curr += ((cntu-cntu1)-(cntd-cntd1));
        //System.out.println(curr);
        curr += " ";
        curr += ((cntl-cntl1)-(cntr-cntr1));
        if (!set.contains(curr)){
            set.add(curr);
            ans++;
        }
        //System.out.println(cntu+" "+cntd);
        
        //System.out.println(curr);
        int n = s.length();
        for (int i=k ; i<n ; i++){
            //System.out.println(cntu1+" "+cntd1);
            char ch = s.charAt(i);
            if (ch=='U'){
                cntu1++;
            }
            else if (ch=='D'){
                cntd1++;
            }
            else if (ch=='L'){
                cntl1++;
            }
            else{
                cntr1++;
            }
            char ch1 = s.charAt(i-k);
            if (ch1=='U'){
                cntu1--;
            }
            else if (ch1=='D'){
                cntd1--;
            }
            else if (ch1=='L'){
                cntl1--;
            }
            else{
                cntr1--;
            }
            curr = "";
            curr += ((cntu-cntu1)-(cntd-cntd1));
            curr += " ";
            curr += ((cntl-cntl1)-(cntr-cntr1));
            //System.out.println(cntu1+" "+cntd1);
            //System.out.println(curr);
            if (!set.contains(curr)){
                set.add(curr);
                ans++;
            }
        }
        return ans;
    }
}