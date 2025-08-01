// Last updated: 8/1/2025, 7:01:47 AM
class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        long ans1=0;
        for (int i=0;i<arr.length;i++){
            ans1+=Math.abs(arr[i]-brr[i]);
        }
        long ans2=k;
        Arrays.sort(arr);
        Arrays.sort(brr);
        for (int i=0;i<arr.length;i++){
            ans2+=Math.abs(arr[i]-brr[i]);
        }
        return Math.min(ans1,ans2);
    }
}