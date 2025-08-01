// Last updated: 8/1/2025, 7:12:27 AM
class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int [] left_max=new int[len];
        left_max[0]=height[0];
        for (int i=1;i<len;i++){
            left_max[i]=Math.max(left_max[i-1],height[i]);
        }
        int [] right_max=new int[len];
        right_max[len-1]=height[len-1];
        for (int j=len-2;j>=0;j--){
            right_max[j]=Math.max(right_max[j+1],height[j]);
        }
        int water_sum=0;
        for(int k=0;k<len;k++){
            water_sum+=Math.min(left_max[k],right_max[k])-height[k];
        }
        return water_sum;
    }
}