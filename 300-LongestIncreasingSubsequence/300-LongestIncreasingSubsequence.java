// Last updated: 9/17/2025, 12:00:29 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        for (int num : nums){
            int st = 0;
            int end = ls.size()-1;
            int ind = -1;
            while (st<=end){
                int mid = (st+end)/2;
                if (ls.get(mid)>=num){
                    ind = mid;
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
            if (ind==-1){
                ls.add(num);
            }
            else{
                ls.set(ind,num);
            }
        }
        return ls.size();
    }
    
}