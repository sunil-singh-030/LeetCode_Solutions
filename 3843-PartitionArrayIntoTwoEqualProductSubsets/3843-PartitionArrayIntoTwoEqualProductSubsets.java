// Last updated: 8/1/2025, 7:01:12 AM
class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        long prd = 1;
        for (int num : nums){
            prd *= num;
        }
        if (target*target!=prd){
            return false;
        }
        return check(nums,0,1,target,0);
        
    }
    public static boolean check(int[] nums, int index , long curr , long tar,int cnt){
        if (cnt>0 && curr==tar){
            return true;
        }
        if (index==nums.length){
            return false;
        }
        boolean f1 = check(nums,index+1,curr*nums[index],tar,cnt+1);
        boolean f2 = check(nums,index+1,curr,tar,cnt);
        return f1 || f2;
    }
    
}