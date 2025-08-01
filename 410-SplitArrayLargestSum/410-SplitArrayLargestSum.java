// Last updated: 8/1/2025, 7:08:46 AM
class Solution {
    public int splitArray(int[] nums, int k) {
        int [] arr=nums;
        int [] arr1=arr.clone();
        Arrays.sort(arr);
        int board=arr.length;
        int painter=k;
        int lo=arr[board-1];
        int sum=0;
        for (int i=0;i<board;i++){
            //arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int hi=sum;
        int res=lo;
        while (lo<=hi){
            int mid=(lo+hi)/2;
            if (isitpossible(arr1,painter,mid)){
                res=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return res;
    }
    public static boolean isitpossible(int [] arr,int painter,int mid){
        int c=1;
        int bl=0;
        for (int i=0;i<arr.length;i++){
            bl+=arr[i];
            if (bl>mid){
                c++;
                bl=arr[i];
            }
            if (c>painter){
                return false;
            }
        }
        return true;
    }
}