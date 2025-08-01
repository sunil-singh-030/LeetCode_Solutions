// Last updated: 8/1/2025, 7:04:09 AM
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        int n = nums.length;
        int[] a = nums.clone();
        Arrays.sort(a);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=n-1 ; i>n-k-1 ; i--){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        int ind = 0;
        for (int i=0 ; i<n ; i++){
            int cnt = map.getOrDefault(nums[i],0);
            if (cnt>0){
                ans[ind] = nums[i];
                ind++;
                if (cnt==1){
                    map.remove(nums[i]);
                }
                else{
                    map.put(nums[i],cnt-1);
                }
            }
            if (ind==k){
                break;
            }
        }
        return ans;
    }
}