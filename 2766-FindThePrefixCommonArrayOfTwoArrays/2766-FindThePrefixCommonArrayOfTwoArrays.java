// Last updated: 8/1/2025, 7:03:00 AM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int [] count=new int[A.length+1];
        int [] arr=new int[A.length];
        int cur=0;
        for (int i=0;i<A.length;i++){
            count[A[i]]++;
            if (count[A[i]]==2){
                cur++;
            }
            count[B[i]]++;
            if (count[B[i]]==2){
                cur++;
            }
            arr[i]=cur;
        }
        return arr;
    }
}