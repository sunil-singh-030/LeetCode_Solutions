// Last updated: 1/4/2026, 11:39:50 AM
1class Solution {
2    public List<List<String>> wordSquares(String[] words) {
3        int n = words.length;
4        List<List<String>> ans = new ArrayList<>();
5        Arrays.sort(words);
6        for (int i=0 ; i<n ; i++){
7            String s1 = words[i];
8            for (int j=0 ; j<n ; j++){
9                String s2 = words[j];
10                if (i!=j && s1.charAt(0)==s2.charAt(0)){
11                    for (int k=0 ; k<n ; k++){
12                        String s3 = words[k];
13                        if (i!=k && j!=k && s1.charAt(3)==s3.charAt(0)){
14                            for (int l=0 ; l<n ; l++){
15                                String s4 = words[l];
16                                if (i!=l && j!=l && k!=l && s2.charAt(3)==s4.charAt(0) && s3.charAt(3)==s4.charAt(3)){
17                                    List<String> ls = new ArrayList<>();
18                                    ls.add(s1);
19                                    ls.add(s2);
20                                    ls.add(s3);
21                                    ls.add(s4);
22                                    ans.add(ls);
23                                }
24                            }
25                        }
26                        
27                    }
28                }
29                
30            }
31        }
32        return ans;
33    }
34}