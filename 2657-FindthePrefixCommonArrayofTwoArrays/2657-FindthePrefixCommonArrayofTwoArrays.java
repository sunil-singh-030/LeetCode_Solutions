// Last updated: 5/20/2026, 12:50:07 PM
1class Solution {
2    public int[] findThePrefixCommonArray(int[] A, int[] B) {
3        int [] count=new int[A.length+1];
4        int [] arr=new int[A.length];
5        int cur=0;
6        for (int i=0;i<A.length;i++){
7            count[A[i]]++;
8            if (count[A[i]]==2){
9                cur++;
10            }
11            count[B[i]]++;
12            if (count[B[i]]==2){
13                cur++;
14            }
15            arr[i]=cur;
16        }
17        return arr;
18    }
19}