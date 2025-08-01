// Last updated: 8/1/2025, 7:06:58 AM
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num,1);
        }
        for (int i=0 ; i<n-2 ; i++){
            for (int j=i+1 ; j<n-1 ; j++){
                if (n-j+1>ans){
                    int len = 2;
                    int num1 = arr[i];
                    int num2 = arr[j];
                    int target = num1+num2;
                    while (map.getOrDefault(target,0)==1){
                        len++;
                        num1 = num2;
                        num2 = target;
                        target = num1+num2;
                    }
                    if (len>2){
                        ans = Math.max(ans,len);
                    }
                }
            }
        }
        return ans;
    }
}