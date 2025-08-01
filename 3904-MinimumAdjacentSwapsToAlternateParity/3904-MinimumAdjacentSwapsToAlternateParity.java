// Last updated: 8/1/2025, 7:00:57 AM
class Solution {
    public int minSwaps(int[] nums) {
        int cnteven = 0;
        int cntodd = 0;
        for (int num : nums){
            if (num%2==0){
                cnteven++;
            }
            else{
                cntodd++;
            }
        }
        int n = nums.length;
        if (n%2==0){
            if (cnteven==cntodd){
                return find(nums,cnteven,cntodd);
            }
            else{
                return -1;
            }
        }
        else{
            if (Math.abs(cnteven-cntodd)==1){
                return find(nums,cnteven,cntodd);
            }
            else{
                return -1;
            }
        }
    }
    public static int find(int[] nums,int ce , int co){
        int n = nums.length;
        int ans1 = 0;
        List<Integer> indo = new ArrayList<>();
        List<Integer> inde = new ArrayList<>();
        for (int i=0 ; i<n ; i++){
            if (nums[i]%2==0){
                inde.add(i);
            }
            else{
                indo.add(i);
            }
        }
        int c = 0;
        for (int i=0 ; i<n ; i+=2){
            if (c==indo.size()){
                ans1 = Integer.MAX_VALUE;
                break;
            }
            ans1 += Math.abs(i-indo.get(c));
            c++;
        }
        int ans2 = 0;
        c = 0;
        for (int i=0 ; i<n ; i+=2){
            if (c==inde.size()){
                ans2 = Integer.MAX_VALUE;
                break;
            }
            ans2 += Math.abs(i-inde.get(c));
            c++;
        }
        return Math.min(ans1,ans2);
    }
}