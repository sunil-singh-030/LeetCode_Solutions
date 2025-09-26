// Last updated: 9/26/2025, 1:49:28 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0 ; i<n-2 ; i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;
            while (j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if (sum>0){
                    k--;
                }
                else if (sum<0){
                    j++;
                }
                else{
                    List<Integer> currls = new ArrayList<>();
                    currls.add(nums[i]);
                    currls.add(nums[j]);
                    currls.add(nums[k]);
                    ls.add(currls);
                    while (j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while (j<k && nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }
            }
        }
        return ls;
    }
}