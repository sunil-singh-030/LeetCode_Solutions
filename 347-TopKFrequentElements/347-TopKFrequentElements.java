// Last updated: 8/1/2025, 7:09:07 AM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int cntdist = 1;
        for (int i=1 ; i<n ; i++){
            if (nums[i]!=nums[i-1]){
                cntdist++;
            }
        }
        //System.out.println(cntdist);
        int[][] elem = new int[cntdist][2];
        int ind = 0;
        int num = nums[0];
        int c = 1;
        for (int i=1 ; i<n ; i++){
            if (nums[i]==num){
                c++;
            }
            else{
                elem[ind][0] = num;
                elem[ind][1] = c;
                num = nums[i];
                c = 1;
                ind++;
            }
        }
        elem[ind][0] = num;
        elem[ind][1] = c;
        Arrays.sort(elem,(a,b) -> b[1]-a[1]);
        int[] out = new int[k];
        for (int i=0 ; i<k ; i++){
            out[i] = elem[i][0];
        }
        return out;
    }
}