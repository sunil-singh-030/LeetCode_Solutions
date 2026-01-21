// Last updated: 1/21/2026, 11:40:18 AM
1class Solution {
2    public int[] minBitwiseArray(List<Integer> nums) {
3        int n = nums.size();
4        int[] out = new int[n];
5        Arrays.fill(out,-1);
6        for (int i=0 ; i<n ; i++){
7            int num = nums.get(i);
8            if (num%2==1){
9                String binStr = bin(num);
10                //System.out.println(i+" "+binStr);
11                binStr = '0' + binStr;
12                int idx = -1;
13                for (int j=binStr.length()-1 ; j>=0 ; j--){
14                    if (binStr.charAt(j)=='0'){
15                        idx = j;
16                        break;
17                    }
18                }
19                //System.out.println(i+" "+binStr+" "+idx);
20                String ans = binStr.substring(0,idx+1);
21                //System.out.println(i+" "+ans);
22                ans += '0';
23                ans += "1".repeat(Math.max(0,binStr.length()-1-idx-1));
24                int n1 = 0;
25                int pow = 0;
26                for (int j=ans.length()-1 ; j>=0 ; j--){
27                    if (ans.charAt(j)=='1'){
28                        n1 += (int) Math.pow(2,pow);
29                    }
30                    pow++;
31                }
32                out[i] = n1;
33                
34            }
35        }
36        return out;
37    }
38    public String bin(int num){
39        String s = "";
40        while (num>0){
41            s = num%2 + s;
42            num /= 2;
43        }
44        return s;
45    }
46}