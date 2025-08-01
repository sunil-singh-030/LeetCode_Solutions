// Last updated: 8/1/2025, 7:09:31 AM
class Solution {
    public int hIndex(int[] citations) {
        int ans=0;
        int left=1;
        int right=citations.length;
        while (left<=right){
            int mid=(left+right)/2;
            if (ispossible(citations,mid)){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        //System.out.println(ispossible(citations,0));
        return ans;
    }
    public static boolean ispossible(int [] citations,int n){
        int ind=citations.length-n;
        int i=-1;
        int left=0;
        int right=citations.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (citations[mid]>=n){
                i=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        //System.out.println(i);
        if (n==0){
            return true;
        }
        if (i==-1){
            return false;
        }
        else{
            return i<=ind;
        }
    }
}