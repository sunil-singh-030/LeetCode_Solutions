// Last updated: 8/1/2025, 7:10:09 AM
class Solution {
    public int countPrimes(int n) {
        if (n<2){
            return 0;
        }
        return primesieve(n);
    }
    public static int primesieve(int n) {
		int cnt = 0;
		int [] ans = new int[n];
		ans[0] = ans[1] = 1;
		for (int i=2 ; i*i<=ans.length ; i++) {
			if (ans[i]==0) {
				for (int j=2 ; i*j<n ; j++) {
					ans[i*j] = 1;
				}
			}
		}
		for (int i=2 ; i<ans.length ; i++) {
			if (ans[i]==0) {
				cnt++;
			}
		}
		return cnt;
	}
}