// Last updated: 8/1/2025, 7:03:08 AM

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long cnt = 0;
        int n = nums.length;
        for (int i=0 ; i<n-1 ; i++){
            if (2*nums[i]>upper ){
                break;
            }
            int maxind = -1;
            int left = i+1;
            int right = n-1;
            while (left<=right){
                int mid = (left+right)/2;
                int sum = nums[mid]+nums[i];
                if (sum>=lower && sum<=upper){
                    maxind = mid;
                    left = mid+1;
                }
                else{
                    if (sum<lower){
                        left = mid+1;
                    }
                    else{
                        right = mid-1;
                    }
                }
            }
            int minind = -1;
            left = i+1;
            right = n-1;
            while (left<=right){
                int mid = (left+right)/2;
                int sum = nums[mid]+nums[i];
                if (sum>=lower && sum<=upper){
                    minind = mid;
                    right = mid-1;
                }
                else{
                    if (sum<lower){
                        left = mid+1;
                    }
                    else{
                        right = mid-1;
                    }
                }
            }
            //System.out.println(i+" "+minind+" "+maxind);
            if (maxind==-1){
                continue;
            }
            cnt += (maxind-minind+1);
        }
        return cnt;
        // 0 1 4 4 5 7
    }
}