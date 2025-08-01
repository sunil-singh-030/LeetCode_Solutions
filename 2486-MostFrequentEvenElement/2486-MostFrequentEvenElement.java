// Last updated: 8/1/2025, 7:03:29 AM
class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int num=-1;
        int count=0;
        for (int i=n-1;i>=0;i--){
            if (nums[i]%2==0){
                int temp=nums[i];
                int c=0;
                for (int j=n-1;j>=0;j--){
                    if (nums[j]==temp){
                        c++;
                    }
                }
                if (c>=count){
                    num=temp;
                    count=c;
                }
            }
        }
        return num;
    }
}