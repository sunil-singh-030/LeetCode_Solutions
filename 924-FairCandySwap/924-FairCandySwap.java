// Last updated: 8/1/2025, 7:06:48 AM
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] ans = new int[2];
        Arrays.sort(bobSizes);
        long s1 = 0;
        long s2 = 0;
        for (int candi : aliceSizes){
            s1 += candi;
        }
        for (int candi : bobSizes){
            s2 += candi;
        }
        int diff = (int) Math.abs(s1-s2);
        boolean flag = true;
        if (s2<s1){
            flag = false;
        }
        for (int candi : aliceSizes){
            int target = (diff/2) + candi;
            if (!flag){
                target = candi-(diff/2);
            }
            int left = 0;
            int right = bobSizes.length-1;
            int ind = -1;
            while (left<=right){
                int mid = (left+right)/2;
                if (bobSizes[mid]==target){
                    ind = mid;
                    break;
                }
                else if (bobSizes[mid]>target){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            if (ind==-1){
                continue;
            }
            ans[0] = candi;
            ans[1] = bobSizes[ind];
            break;
        }
        return ans;
    }
}