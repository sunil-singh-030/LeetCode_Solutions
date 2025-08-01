// Last updated: 8/1/2025, 7:03:03 AM
class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
        int n = nums.length;
        List<Long> ls = new ArrayList<>();
        Arrays.sort(nums);
        long[] prefixsum = new long[n];
        long sum = 0;
        for (int i=0 ; i<n ; i++){
            sum += nums[i];
            prefixsum[i] = sum;
        }
        for (int query : queries){
            int ind = -1;
            int start = 0;
            int end = n-1;
            while (start<=end){
                int mid = (start+end)/2;
                if (query<=nums[mid]){
                    ind = mid;
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            if (ind==-1){
                long req =((long) n*(query)) - prefixsum[n-1];
                ls.add(req);
            }
            else{ // 1 3 6 8
                if (ind==0){
                    long req = prefixsum[n-1] - ((long) n*(query));
                    ls.add(req);
                }
                else{
                    long req = prefixsum[n-1]-prefixsum[ind-1]-( (long) query*(n-ind));
                    req += (((long) (ind)*query) -  prefixsum[ind-1]);
                    ls.add(req);
                }
            }
        }
        return ls;
    }
}