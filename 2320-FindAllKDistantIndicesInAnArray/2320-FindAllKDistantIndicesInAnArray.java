// Last updated: 8/1/2025, 7:03:50 AM
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> out = new ArrayList<>();
        List<Integer> keyInd = new ArrayList<>();
        int n = nums.length;
        for (int i=0 ; i<n ; i++){
            if (nums[i]==key){
                keyInd.add(i);
            }
        }
        for (int i=0 ; i<n ; i++){
            int st = 0;
            int end = keyInd.size()-1;
            while (st<=end){
                int mid = (st+end)/2;
                int pos = keyInd.get(mid);
                if (Math.abs(i-pos)<=k){
                    out.add(i);
                    break;
                }
                else{
                    if (i>pos){
                        st = mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                }
            }
        }
        return out;
    }
}