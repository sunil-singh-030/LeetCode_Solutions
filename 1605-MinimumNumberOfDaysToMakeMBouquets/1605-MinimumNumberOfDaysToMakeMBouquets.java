// Last updated: 8/1/2025, 7:05:12 AM
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i:bloomDay){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        int ans=-1;
        while (min<=max){
            int mid=(min+max)/2;
            if (isitpossible(bloomDay,m,k,mid)){
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int [] bloomDay,int m,int k,int mid){
        int c=0;
        boolean [] arr=new boolean[bloomDay.length];
        for (int i=0;i<bloomDay.length;i++){
            if (bloomDay[i]<=mid){
                arr[i]=true;
            }
        }
        int count=0;
        for (int i=0;i<bloomDay.length;i++){
            if (arr[i]){
                count++;
            }
            else{
                count=0;
            }
            if (count==k){
                c++;
                count=0;
            }
            if (c==m){
                return true;
            }
        }
        return false;
    }
}