// Last updated: 12/19/2025, 11:54:06 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ls = new ArrayList<>();
        int stIdx = 0;
        for (int i=1 ; i<n ; i++){
            if (nums[i]>=nums[i-1]){
                continue;
            }
            List<Integer> temp = new ArrayList<>();
            temp.add(stIdx);
            temp.add(i-1);
            ls.add(temp);
            stIdx = i;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(stIdx);
        temp.add(n-1);
        ls.add(temp);
        int maxLen = 1;
        for (int i=1 ; i<ls.size() ; i++){
            int currSize = ls.get(i).get(1)-ls.get(i).get(0)+1;
            temp = ls.get(i-1);
            if ((temp.get(0)!=temp.get(1)) && (nums[temp.get(1)-1]<=nums[ls.get(i).get(0)])){
                currSize += temp.get(1)-temp.get(0)+1;
            }
            else{
                currSize++;
            }
            maxLen = Math.max(maxLen,currSize);
        }
        for (int i=0 ; i<ls.size()-1 ; i++){
            int currSize = ls.get(i).get(1)-ls.get(i).get(0)+1;
            temp = ls.get(i+1);        
            if ( temp.get(1)-temp.get(0)>0  && (nums[temp.get(0)+1]>=nums[ls.get(i).get(1)])){
                currSize += temp.get(1)-temp.get(0)+1;
            }
            else{
                currSize++;
            }
            maxLen = Math.max(maxLen,currSize);
        }
        int s1 = ls.get(0).size();
        int currSize = ls.get(0).get(s1-1)-ls.get(0).get(0)+1;
        maxLen = Math.max(maxLen,currSize);
        return maxLen;
    }
    
}