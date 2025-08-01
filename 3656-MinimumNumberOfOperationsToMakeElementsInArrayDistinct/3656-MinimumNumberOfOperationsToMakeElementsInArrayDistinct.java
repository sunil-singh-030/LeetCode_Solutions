// Last updated: 8/1/2025, 7:02:01 AM
class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int ind = -1;
        for (int i=n-1 ; i>=0 ; i--){
            if (!set.contains(nums[i])){
                set.add(nums[i]);
                continue;
            }
            ind = i;
            break;
        }
        int req = (ind+1)/3;
        if ((ind+1)%3!=0){
            req++;
        }
        return ind==-1 ? 0 : req;
    }
}