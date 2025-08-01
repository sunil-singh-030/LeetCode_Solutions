// Last updated: 8/1/2025, 7:09:53 AM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> ls = new ArrayList<>();
        if (n==0){
            return ls;
        }
        int numst = nums[0];
        int num = nums[0];
        int cnt = 1;
        for (int i=1 ; i<n ; i++){
            if (num+1==nums[i]){
                num ++;
                cnt++;
            }
            else{
                if (cnt==1){
                    ls.add(String.valueOf(numst));
                }
                else{
                    ls.add(String.format("%s->%d",numst,nums[i-1]));
                }
                numst = nums[i];
                cnt = 1;
                num = nums[i];
            }
        }
        if (cnt==1){
            ls.add(String.valueOf(numst));
        }
        else{
            ls.add(String.format("%s->%d",numst,nums[n-1]));
        }
        return ls;
    }
}