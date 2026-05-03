// Last updated: 5/3/2026, 3:53:50 PM
1class Solution {
2    public int sumOfPrimesInRange(int n) {
3        boolean[] isprime = new boolean[1001];
4        Arrays.fill(isprime,true);
5        isprime[0] = false;
6        isprime[1] = false;
7        for (int i=2 ; i*i<1001 ; i++){
8            if (isprime[i]){
9                for (int j=i+i ; j<1001 ; j+=i){
10                    isprime[j] = false;
11                }
12            }
13        }
14        int[] sumprime = new int[1001];
15        for (int i=1 ; i<1001 ; i++){
16            sumprime[i] = sumprime[i-1];
17            if (isprime[i]){
18                sumprime[i] += i;
19            }
20        }
21        int newNum = 0;
22        int temp = n;
23        while (temp>0){
24            newNum *= 10;
25            newNum += temp%10;
26            temp /= 10;
27        }
28        int min = Math.min(n,newNum);
29        int max = Math.max(n,newNum);
30        return sumprime[max]-sumprime[min-1];
31    }
32}