// Last updated: 8/1/2025, 7:07:27 AM
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int count=1;
        boolean []  flag=new boolean[arr.length]; // f t t
        flag[arr[arr.length-1]]=true;
        boolean check;
        for (int i=arr.length-2;i>=0;i--){
            check=true;
            for (int j=0;j<=i;j++){
                if (flag[j]){
                    check=false;
                    break;
                }
            }
            if (check){
                count++;
            }
            flag[arr[i]]=true;
        }
        return count;
    }
}