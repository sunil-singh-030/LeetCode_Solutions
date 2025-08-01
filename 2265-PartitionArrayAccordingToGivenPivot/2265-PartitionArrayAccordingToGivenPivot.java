// Last updated: 8/1/2025, 7:04:00 AM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int cntpivot = 0;
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        for (int i=0 ; i<nums.length ; i++){
            int num = nums[i];
            if (num<pivot){
                ls1.add(num);
            }
            else if (num>pivot) {
                ls2.add(num);
            }
            else{
                cntpivot++;
            }
        }
        int[] ans = new int[nums.length];
        for (int i=0 ; i<ls1.size() ; i++){
            ans[i] = ls1.get(i);
        }
        int ind = ls1.size();
        while (cntpivot-->0){
            ans[ind] = pivot;
            ind++;
        }
        for (int i=0 ; i<ls2.size() ; i++){
            ans[ind] = ls2.get(i);
            ind++;
        }
        return ans;
    }
}