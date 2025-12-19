// Last updated: 12/19/2025, 11:53:57 AM
class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        if (k==0){
            return n;
        }
        int ele = nums[n-1];
        int c = 1;
        for (int i=n-2 ; i>=0 ; i--){
            if (c==k){
                break;
            }
            c++;
            if (nums[i]!=ele){
                ele = nums[i];
            }
        }
        int idx = -1;
        for (int i=n-1 ; i>=0 ; i--){
            if (nums[i]<ele){
                idx = i;
                break;
            }
        }
        return idx!=-1 ? idx + 1 : 0;
    }
}