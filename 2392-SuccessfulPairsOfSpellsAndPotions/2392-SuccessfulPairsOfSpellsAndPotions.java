// Last updated: 8/1/2025, 7:03:40 AM
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int [] ans=new int[spells.length];
        for (int i=0;i<spells.length;i++){
            int ind=-1;
            int left=0;
            int right=potions.length-1;
            long target=(long) Math.ceil(success/(double) spells[i]);
            while (left<=right){
                int mid=(left+right)/2;
                if (potions[mid]>=target){
                    ind=mid;
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            if (ind==-1){
                continue;
            }
            ans[i]=potions.length-ind;
        }
        return ans;
    }
}