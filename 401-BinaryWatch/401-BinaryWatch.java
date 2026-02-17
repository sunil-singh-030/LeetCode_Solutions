// Last updated: 2/17/2026, 10:02:46 AM
1class Solution {
2    List<String> ans;
3    public List<String> readBinaryWatch(int turnedOn) {
4        ans = new ArrayList<>();
5        jaiBabaKi(10,turnedOn,"");
6        return ans;
7    }
8    public void jaiBabaKi(int n, int left, String s){
9        if (n==0){
10            int hr = 0;
11            int pow = 0;
12            for (int i=3 ; i>=0 ; i--){
13                char ch = s.charAt(i);
14                if (ch=='1'){
15                    hr += (int) Math.pow(2,pow);
16                }
17                pow++;
18            }
19            int min = 0;
20            pow = 0;
21            for (int i=9 ; i>3 ; i--){
22                char ch = s.charAt(i);
23                if (ch=='1'){
24                    min += (int) Math.pow(2,pow);
25                }
26                pow++;
27            }
28            
29            if (min<60 && hr<12){
30                if (min<10){
31                    ans.add(hr+":0"+min);
32                }
33                else{
34                    ans.add(hr+":"+min);
35                }
36                
37            }
38            
39            return;
40        }
41        if (n>left){
42            jaiBabaKi(n-1,left,s+"0");
43        }
44        if (left>0){
45            jaiBabaKi(n-1,left-1,s+"1");
46        }
47        
48        
49    }
50}