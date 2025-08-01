// Last updated: 8/1/2025, 7:02:33 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        List<Long> ls = new ArrayList<>();
        for (int i=0 ; i<n ; i++){
            if (nums[i]<k){
                ls.add((long) nums[i]);
            }
        }
        Collections.sort(ls);
        boolean flag = true;
        int cnt = 0;
        while (flag && ls.size()>=2){
            flag = false;
            long num1 = ls.get(0);
            if (num1>=k){
                return cnt;
            }
            flag = true;
            long num2 = ls.get(1);
            long newnum = (num1*2) + num2;
            ls.remove(0);
            ls.remove(0);
            if (newnum<k){
                int ind = -1;
                int left = 0;
                int right = ls.size()-1;
                while (left<=right){
                    int mid = (left+right)/2;
                    if (ls.get(mid)>=newnum){
                        ind = mid;
                        right = mid-1;
                    }
                    else{
                        left = mid+1; 
                    }
                }
                if (ind==-1){
                ls.add(newnum);
                }
                else{
                    ls.add(ind,newnum);
                }
            }
            cnt++;
        }
        if (ls.size()==1){
            cnt++;
        }
        return cnt;
    }
}