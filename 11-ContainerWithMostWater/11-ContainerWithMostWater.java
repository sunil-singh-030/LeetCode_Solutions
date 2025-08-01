// Last updated: 8/1/2025, 7:13:02 AM
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int max=0;
        while (left<right){
            int h1=height[left];
            int h2=height[right];
            int area=Math.min(h1,h2)*(right-left);
            max=Math.max(max,area);
            if (h1<h2){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}