// Last updated: 8/1/2025, 7:09:21 AM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> ls = new ArrayList<>();
        ls.add(nums[0]);
        int maxLen = 1;
        for (int i=1 ; i<n ; i++){
            int num = nums[i];
            int cnt = 0;
            int lb = 0;
            int ub = ls.size()-1;
            while (lb<=ub){
                int mid = (lb+ub)/2;
                if (ls.get(mid)<num){
                    cnt = mid+1;
                    lb = mid+1;
                }
                else{
                    ub = mid-1;
                }
            }
            maxLen = Math.max(maxLen,cnt+1);
            if (cnt==ls.size()){
                ls.add(num);
            }
            else{
                ls.set(cnt,num);
            }
        }
        return maxLen;
    }
    
}