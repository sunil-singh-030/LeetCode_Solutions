// Last updated: 2/25/2026, 10:07:00 AM
1class Solution {
2    public int[] sortByBits(int[] arr) {
3        int[] newarr = new int [arr.length];
4
5        for(int i=0; i<arr.length; i++){
6            newarr[i] = countbit(arr[i])*10001 + arr[i];
7
8        }
9        Arrays.sort(newarr);
10
11        for(int i=0; i<arr.length;i++){
12            newarr[i] = newarr[i]%10001;
13        }
14        
15        return newarr;
16
17    }
18
19    public int countbit(int n){
20        int count =0; 
21        while(n!=0){
22            count = count+(n&1);
23            n>>=1;
24        }
25        return count;
26    }
27}